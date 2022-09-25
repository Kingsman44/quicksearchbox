package com.google.android.libraries.gsa.monet.internal.service;

import com.google.android.libraries.gsa.monet.shared.C23081al;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;

/* renamed from: com.google.android.libraries.gsa.monet.internal.service.e */
/* compiled from: PG */
public final /* synthetic */ class C23009e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C23015k f63286a;

    /* renamed from: b */
    public final /* synthetic */ String f63287b;

    /* renamed from: c */
    public final /* synthetic */ C23129y f63288c;

    /* renamed from: d */
    public final /* synthetic */ ProtoParcelable f63289d;

    /* renamed from: e */
    public final /* synthetic */ C23029y f63290e;

    /* renamed from: f */
    public final /* synthetic */ boolean f63291f;

    /* renamed from: g */
    public final /* synthetic */ C23081al f63292g;

    public /* synthetic */ C23009e(C23015k kVar, String str, C23129y yVar, ProtoParcelable protoParcelable, C23029y yVar2, boolean z, C23081al alVar) {
        this.f63286a = kVar;
        this.f63287b = str;
        this.f63288c = yVar;
        this.f63289d = protoParcelable;
        this.f63290e = yVar2;
        this.f63291f = z;
        this.f63292g = alVar;
    }

    public final void run() {
        C23015k kVar = this.f63286a;
        String str = this.f63287b;
        C23015k a = kVar.f63309d.mo28446a(str, this.f63288c, this.f63289d, this.f63290e, this.f63291f, this.f63292g);
        kVar.f63307b.mo28444b(str, a);
        if (kVar.mo28419C()) {
            a.mo28432v();
        }
    }
}
