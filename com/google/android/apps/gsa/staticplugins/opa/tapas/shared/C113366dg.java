package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.content.res.Resources;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.dg */
/* compiled from: PG */
final class C113366dg extends Resources.NotFoundException {
    public C113366dg() {
        super("Retrieving drawable returned null");
    }

    public C113366dg(Exception exc) {
        super("Drawable not found");
        initCause(exc);
    }
}
