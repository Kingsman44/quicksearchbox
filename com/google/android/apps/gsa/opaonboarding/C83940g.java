package com.google.android.apps.gsa.opaonboarding;

import android.os.Bundle;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.p4553a.C59567w;

/* renamed from: com.google.android.apps.gsa.opaonboarding.g */
/* compiled from: PG */
public final class C83940g extends C83879am {

    /* renamed from: a */
    public String f228605a;

    /* renamed from: b */
    public Bundle f228606b;

    /* renamed from: c */
    public C83818a f228607c;

    /* renamed from: d */
    public C58833ax f228608d;

    /* renamed from: e */
    public C58833ax f228609e;

    /* renamed from: f */
    public C58833ax f228610f;

    /* renamed from: g */
    public String f228611g;

    /* renamed from: h */
    public byte f228612h;

    /* renamed from: i */
    private C59567w f228613i;

    /* renamed from: j */
    private boolean f228614j;

    /* renamed from: k */
    private int f228615k;

    /* renamed from: l */
    private int f228616l;

    /* renamed from: m */
    private int f228617m;

    public C83940g() {
        C58836b bVar = C58836b.f156633a;
        this.f228608d = bVar;
        this.f228609e = bVar;
        this.f228610f = bVar;
    }

    /* renamed from: a */
    public final C83880an mo77221a() {
        String str;
        Bundle bundle;
        C83818a aVar;
        C59567w wVar;
        String str2;
        if (this.f228612h == 31 && (str = this.f228605a) != null && (bundle = this.f228606b) != null && (aVar = this.f228607c) != null && (wVar = this.f228613i) != null && (str2 = this.f228611g) != null) {
            return new C83941h(str, bundle, aVar, this.f228608d, this.f228609e, this.f228610f, wVar, this.f228614j, str2, this.f228615k, this.f228616l, this.f228617m);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f228605a == null) {
            sb.append(" sequenceName");
        }
        if (this.f228606b == null) {
            sb.append(" sequenceArguments");
        }
        if (this.f228607c == null) {
            sb.append(" accountConfig");
        }
        if (this.f228613i == null) {
            sb.append(" assistantOnboarding");
        }
        if ((this.f228612h & 1) == 0) {
            sb.append(" hideCaptionBar");
        }
        if (this.f228611g == null) {
            sb.append(" gsaPackageName");
        }
        if ((this.f228612h & 2) == 0) {
            sb.append(" sequenceTheme");
        }
        if ((this.f228612h & 4) == 0) {
            sb.append(" materialNextMode");
        }
        if ((this.f228612h & 8) == 0) {
            sb.append(" sequenceOrientationMode");
        }
        if ((this.f228612h & 16) == 0) {
            sb.append(" useNoOrientationConfigChange");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo77222b(C59567w wVar) {
        if (wVar != null) {
            this.f228613i = wVar;
            return;
        }
        throw new NullPointerException("Null assistantOnboarding");
    }

    /* renamed from: c */
    public final void mo77223c(boolean z) {
        this.f228614j = z;
        this.f228612h = (byte) (this.f228612h | 1);
    }

    /* renamed from: d */
    public final void mo77224d(int i) {
        this.f228616l = i;
        this.f228612h = (byte) (this.f228612h | 4);
    }

    /* renamed from: e */
    public final void mo77225e(int i) {
        this.f228617m = i;
        this.f228612h = (byte) (this.f228612h | 8);
    }

    /* renamed from: f */
    public final void mo77226f(int i) {
        this.f228615k = i;
        this.f228612h = (byte) (this.f228612h | 2);
    }
}
