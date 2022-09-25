package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.gsa.util.p1935a.C23336a;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.al */
/* compiled from: PG */
final class C102468al {

    /* renamed from: a */
    public final String f285971a;

    /* renamed from: b */
    public final int f285972b;

    /* renamed from: c */
    public final Uri f285973c;

    /* renamed from: d */
    public final boolean f285974d;

    /* renamed from: e */
    public final Intent f285975e;

    /* renamed from: f */
    final /* synthetic */ C102475as f285976f;

    public C102468al(C102475as asVar, String str, int i, Uri uri, boolean z) {
        this.f285976f = asVar;
        this.f285971a = str;
        this.f285972b = i;
        this.f285973c = uri;
        this.f285974d = z;
        this.f285975e = C23336a.m43768a(uri.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C102468al) {
            C102468al alVar = (C102468al) obj;
            if (this.f285976f == alVar.f285976f && C58832aw.m90831a(this.f285971a, alVar.f285971a) && this.f285972b == alVar.f285972b && C58832aw.m90831a(this.f285973c, alVar.f285973c) && this.f285974d == alVar.f285974d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f285976f, this.f285971a, Integer.valueOf(this.f285972b), this.f285973c, Boolean.valueOf(this.f285974d)});
    }
}
