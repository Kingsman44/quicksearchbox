package com.google.android.apps.gsa.shared.p7148ui.p7155g.p7156a;

import android.content.res.TypedArray;
import android.text.TextUtils;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.ui.g.a.f */
/* compiled from: PG */
public final class C90684f {

    /* renamed from: a */
    public static TypedArray f253600a;

    /* renamed from: b */
    public static int f253601b;

    /* renamed from: c */
    public static int f253602c;

    /* renamed from: d */
    private static final C59071e f253603d = C59071e.m91332i("com.google.android.apps.gsa.shared.ui.g.a.f");

    /* renamed from: a */
    public static final int m148052a(String str) {
        if (TextUtils.isEmpty(str) || f253601b == 0) {
            return f253602c;
        }
        int hashCode = str != null ? str.hashCode() : 0;
        int i = f253601b;
        int i2 = hashCode % i;
        if (i2 < 0) {
            i2 += i;
        }
        try {
            return f253600a.getColor(i2, f253602c);
        } catch (UnsupportedOperationException unused) {
            C59104x c = f253603d.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LtrTileClrPicker");
            ((C59052c) ((C59052c) c).mo56372aa(11304)).mo56389s("Extract color failed: %s.", str);
            return f253602c;
        }
    }
}
