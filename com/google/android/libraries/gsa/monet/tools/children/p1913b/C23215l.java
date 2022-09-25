package com.google.android.libraries.gsa.monet.tools.children.p1913b;

import com.google.android.libraries.gsa.monet.shared.C23118n;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.shared.C23242k;
import com.google.android.libraries.gsa.monet.tools.children.shared.p1915a.C23232b;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.b.l */
/* compiled from: PG */
public final class C23215l implements C23118n {

    /* renamed from: a */
    public final String f63639a;

    /* renamed from: b */
    public C23129y f63640b;

    /* renamed from: c */
    private final String f63641c;

    /* renamed from: d */
    private boolean f63642d;

    /* renamed from: e */
    private boolean f63643e;

    /* renamed from: f */
    private final C23224u f63644f;

    public C23215l(String str, C23224u uVar) {
        this.f63639a = str;
        this.f63641c = C23242k.m43542b(str);
        this.f63644f = uVar;
    }

    /* renamed from: f */
    private final void m43474f(C23129y yVar, boolean z, boolean z2) {
        C23129y yVar2 = this.f63640b;
        boolean z3 = false;
        if (this.f63642d && this.f63643e) {
            z3 = true;
        }
        this.f63640b = yVar;
        this.f63642d = z;
        this.f63643e = z2;
        C23224u uVar = this.f63644f;
        boolean e = mo28680e();
        if (yVar2 == null) {
            if (yVar != null) {
                uVar.mo28689c(yVar);
                if (e) {
                    uVar.mo28688b(yVar);
                }
            }
        } else if (yVar == null) {
            if (z3) {
                uVar.mo28690d();
            } else {
                uVar.mo28687a();
            }
        } else if (yVar2.equals(yVar)) {
            if (!z3 && e) {
                uVar.mo28688b(yVar);
            }
            if (z3 && !e) {
                uVar.mo28690d();
                uVar.mo28689c(yVar);
            }
        } else {
            if (z3) {
                uVar.mo28690d();
            } else {
                uVar.mo28687a();
            }
            uVar.mo28689c(yVar);
            if (e) {
                uVar.mo28688b(yVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo28563a(C23120p pVar) {
        if (pVar.f63472a.containsKey(this.f63641c)) {
            ProtoParcelable protoParcelable = (ProtoParcelable) pVar.f63472a.getParcelable(this.f63641c);
            protoParcelable.getClass();
            C23232b bVar = (C23232b) C23245b.m43557b(protoParcelable, C23232b.f63678c.getParserForType(), C62921ba.f169869a, true);
            bVar.getClass();
            m43474f(this.f63640b, this.f63642d, bVar.f63681b);
        }
    }

    /* renamed from: b */
    public final void mo28677b(C23129y yVar) {
        m43474f(yVar, true, this.f63643e);
    }

    /* renamed from: c */
    public final void mo28678c(C23129y yVar) {
        m43474f(yVar, false, this.f63643e);
    }

    /* renamed from: d */
    public final void mo28679d() {
        m43474f((C23129y) null, false, this.f63643e);
    }

    /* renamed from: e */
    public final boolean mo28680e() {
        return this.f63642d && this.f63643e;
    }
}
