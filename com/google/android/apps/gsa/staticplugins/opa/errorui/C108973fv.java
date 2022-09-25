package com.google.android.apps.gsa.staticplugins.opa.errorui;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.fv */
/* compiled from: PG */
final class C108973fv extends ThreadLocal {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized SimpleDateFormat initialValue() {
        return new SimpleDateFormat("h:mm a", Locale.US);
    }
}
