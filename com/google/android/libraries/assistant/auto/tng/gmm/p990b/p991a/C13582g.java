package com.google.android.libraries.assistant.auto.tng.gmm.p990b.p991a;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.p453b.p457b.p458a.p459a.C8998a;
import com.google.android.apps.p453b.p457b.p460b.p463c.C9014b;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.net.p4726a.p4728b.C62724b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.b.a.g */
/* compiled from: PG */
final class C13582g extends C8998a {

    /* renamed from: a */
    final /* synthetic */ C13583h f41587a;

    public C13582g(C13583h hVar) {
        this.f41587a = hVar;
    }

    /* renamed from: a */
    public final void mo17308a(byte[] bArr) {
        C9014b bVar;
        C2164c cVar = (C2164c) this.f41587a.f41590c.get();
        C62722b bVar2 = C62722b.UNKNOWN;
        try {
            bVar = new C9014b((C62724b) C62942bv.parseFrom((C62942bv) C62724b.f169416g, bArr, C62921ba.m95368a()));
        } catch (C62974ct e) {
            bVar = new C9014b(bVar2, e);
        }
        cVar.mo5439d(bVar);
    }

    /* renamed from: b */
    public final void mo17309b(byte[] bArr) {
        try {
            ((C2164c) this.f41587a.f41590c.get()).mo5437b(this.f41587a.f41589b.mo59010i(bArr));
        } catch (C62974ct e) {
            ((C2164c) this.f41587a.f41590c.get()).mo5439d(new C9014b(C62722b.INTERNAL, e));
        }
    }
}
