package com.google.android.apps.gsa.staticplugins.opa.errorui;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.fw */
/* compiled from: PG */
final class C108974fw extends ThreadLocal {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized SimpleDateFormat initialValue() {
        return new SimpleDateFormat("H:mm", Locale.US);
    }
}
