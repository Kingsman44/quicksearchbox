package com.google.android.apps.gsa.staticplugins.actions.p7359e;

import android.content.res.Resources;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4534f.C59081b;
import java.util.Arrays;
import java.util.IllegalFormatException;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.e.a */
/* compiled from: PG */
public final class C93332a {

    /* renamed from: d */
    private static final C59071e f260294d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.e.a");

    /* renamed from: a */
    public final int f260295a;

    /* renamed from: b */
    public final int f260296b;

    /* renamed from: c */
    public final boolean f260297c;

    /* renamed from: e */
    private final Resources f260298e;

    /* renamed from: f */
    private final Object[] f260299f;

    public C93332a(int i, int i2, Resources resources, boolean z, Object[] objArr) {
        this.f260295a = i;
        this.f260296b = i2;
        this.f260298e = resources;
        this.f260297c = z;
        this.f260299f = objArr;
    }

    /* renamed from: a */
    public final String mo87639a(int i) {
        try {
            return this.f260298e.getString(i, this.f260299f);
        } catch (IllegalFormatException e) {
            ((C59052c) ((C59052c) ((C59052c) f260294d.mo56225c()).mo56382g(e)).mo56372aa(13638)).mo56359L("Failed to format resource %d (%s) with args %s. Returning empty string.", Integer.valueOf(i), this.f260298e.getString(i), Arrays.toString(this.f260299f));
            return " ";
        } catch (Resources.NotFoundException unused) {
            ((C59052c) ((C59052c) f260294d.mo56225c()).mo56372aa(13639)).mo56387q("Tried to retrieve non-existent string resource: %d", i);
            C59081b.m91349a(C58979ad.FULL, "stack size");
            return " ";
        }
    }
}
