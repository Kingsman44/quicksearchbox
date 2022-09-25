package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
public final class ComponentConfig {
    final int materializationBloatMs;
    final boolean reuseEntitiesProcessors;
    final boolean suppressPriorModelCheck;
    final boolean useEkoCanaryChannel;
    final boolean useEntitiesProcessorMap;
    final boolean usePriorModelHash;

    public ComponentConfig(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.useEkoCanaryChannel = z;
        this.materializationBloatMs = i;
        this.reuseEntitiesProcessors = z2;
        this.useEntitiesProcessorMap = z3;
        this.usePriorModelHash = z4;
        this.suppressPriorModelCheck = z5;
    }

    public int getMaterializationBloatMs() {
        return this.materializationBloatMs;
    }

    public boolean getReuseEntitiesProcessors() {
        return this.reuseEntitiesProcessors;
    }

    public boolean getSuppressPriorModelCheck() {
        return this.suppressPriorModelCheck;
    }

    public boolean getUseEkoCanaryChannel() {
        return this.useEkoCanaryChannel;
    }

    public boolean getUseEntitiesProcessorMap() {
        return this.useEntitiesProcessorMap;
    }

    public boolean getUsePriorModelHash() {
        return this.usePriorModelHash;
    }

    public String toString() {
        boolean z = this.useEkoCanaryChannel;
        int i = this.materializationBloatMs;
        boolean z2 = this.reuseEntitiesProcessors;
        boolean z3 = this.useEntitiesProcessorMap;
        boolean z4 = this.usePriorModelHash;
        boolean z5 = this.suppressPriorModelCheck;
        return "ComponentConfig{useEkoCanaryChannel=" + z + ",materializationBloatMs=" + i + ",reuseEntitiesProcessors=" + z2 + ",useEntitiesProcessorMap=" + z3 + ",usePriorModelHash=" + z4 + ",suppressPriorModelCheck=" + z5 + "}";
    }
}
