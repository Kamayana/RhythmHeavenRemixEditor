package io.github.chrislo27.rhre3.registry.datamodel.impl.special

import io.github.chrislo27.rhre3.entity.model.special.EndEntity
import io.github.chrislo27.rhre3.registry.Game
import io.github.chrislo27.rhre3.track.Remix


class EndRemix(game: Game, id: String, deprecatedIDs: List<String>, name: String)
    : SpecialDatamodel(game, id, deprecatedIDs, name) {

    override fun createEntity(remix: Remix): EndEntity {
        return EndEntity(remix, this)
    }

    override fun dispose() {
    }
}
