package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.NonScrollableLinearLayoutManager */
/* compiled from: PG */
public final class NonScrollableLinearLayoutManager extends LinearLayoutManager {
    public NonScrollableLinearLayoutManager(Context context) {
        super(context, 1, false);
    }

    public final boolean canScrollHorizontally() {
        return false;
    }

    public final boolean canScrollVertically() {
        return false;
    }
}
