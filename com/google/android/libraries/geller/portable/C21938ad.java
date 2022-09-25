package com.google.android.libraries.geller.portable;

import android.content.Context;
import com.google.android.libraries.geller.portable.callbacks.C21951b;
import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p4985f.p5030q.p5032b.C65021af;
import java.util.Set;

/* renamed from: com.google.android.libraries.geller.portable.ad */
/* compiled from: PG */
public final class C21938ad {

    /* renamed from: a */
    public final Context f60522a;

    /* renamed from: b */
    public final C60887da f60523b;

    /* renamed from: c */
    public final C60887da f60524c;

    /* renamed from: d */
    public Set f60525d = C58733pz.f156496a;

    /* renamed from: e */
    public boolean f60526e = false;

    /* renamed from: f */
    public final boolean f60527f = true;

    /* renamed from: g */
    public final C58490gz f60528g = new C58490gz(4);

    /* renamed from: h */
    public GellerLoggingCallback f60529h = new C21951b();

    /* renamed from: i */
    public C58833ax f60530i;

    /* renamed from: j */
    public C58833ax f60531j;

    /* renamed from: k */
    public C58833ax f60532k;

    /* renamed from: l */
    public C58833ax f60533l;

    /* renamed from: m */
    public C58833ax f60534m;

    /* renamed from: n */
    public C65021af f60535n;

    public C21938ad(Context context, C60887da daVar, C60887da daVar2, Set set) {
        C58836b bVar = C58836b.f156633a;
        this.f60530i = bVar;
        this.f60531j = bVar;
        this.f60532k = bVar;
        this.f60533l = bVar;
        this.f60534m = bVar;
        this.f60535n = C65021af.f176076g;
        this.f60522a = context;
        this.f60523b = daVar;
        this.f60524c = daVar2;
        if (set != null) {
            this.f60525d = set;
        }
    }
}
