package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8393i;
import com.google.p386ak.p393c.C8383a;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.lang.reflect.Field;

/* renamed from: com.google.ak.b.a.n */
/* compiled from: PG */
final class C8314n extends C8316p {

    /* renamed from: a */
    final /* synthetic */ boolean f29108a;

    /* renamed from: b */
    final /* synthetic */ Field f29109b;

    /* renamed from: c */
    final /* synthetic */ boolean f29110c;

    /* renamed from: d */
    final /* synthetic */ C8266aa f29111d;

    /* renamed from: e */
    final /* synthetic */ C8393i f29112e;

    /* renamed from: f */
    final /* synthetic */ C8383a f29113f;

    /* renamed from: g */
    final /* synthetic */ boolean f29114g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8314n(String str, boolean z, boolean z2, boolean z3, Field field, boolean z4, C8266aa aaVar, C8393i iVar, C8383a aVar, boolean z5) {
        super(str, z, z2);
        this.f29108a = z3;
        this.f29109b = field;
        this.f29110c = z4;
        this.f29111d = aaVar;
        this.f29112e = iVar;
        this.f29113f = aVar;
        this.f29114g = z5;
    }

    /* renamed from: a */
    public final void mo17039a(C8385a aVar, Object obj) {
        Object a = this.f29111d.mo17029a(aVar);
        if (a != null || !this.f29114g) {
            if (this.f29108a) {
                C8317q.m23072b(obj, this.f29109b);
            }
            this.f29109b.set(obj, a);
        }
    }

    /* renamed from: b */
    public final void mo17040b(C8387c cVar, Object obj) {
        C8266aa aaVar;
        if (this.f29118i) {
            if (this.f29108a) {
                C8317q.m23072b(obj, this.f29109b);
            }
            Object obj2 = this.f29109b.get(obj);
            if (obj2 != obj) {
                cVar.mo17137g(this.f29117h);
                if (this.f29110c) {
                    aaVar = this.f29111d;
                } else {
                    aaVar = new C8320t(this.f29112e, this.f29111d, this.f29113f.f29214b);
                }
                aaVar.mo17030b(cVar, obj2);
            }
        }
    }
}
