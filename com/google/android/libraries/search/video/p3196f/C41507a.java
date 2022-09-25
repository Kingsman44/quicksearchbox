package com.google.android.libraries.search.video.p3196f;

import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.video.players.C41592w;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57143b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57177h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.video.f.a */
/* compiled from: PG */
public final /* synthetic */ class C41507a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C41511e f108432a;

    public /* synthetic */ C41507a(C41511e eVar) {
        this.f108432a = eVar;
    }

    public final void onClick(View view) {
        Object obj;
        C41592w wVar;
        C41511e eVar = this.f108432a;
        C41510d dVar = eVar.f108446j;
        dVar.getClass();
        ImageView imageView = eVar.f108439c;
        imageView.getClass();
        C41517k kVar = (C41517k) dVar;
        if (kVar.f108462B != null) {
            C28443m mVar = kVar.f108474g;
            C28442l a = C28442l.m53142h().mo33894a();
            C28439i iVar = kVar.f108462B;
            iVar.getClass();
            mVar.mo33853c(a, iVar);
            C28439i iVar2 = kVar.f108462B;
            iVar2.getClass();
            iVar2.mo33892i(2);
            kVar.f108473f.mo33922f();
        }
        C57143b bVar = kVar.f108465E;
        if (bVar != null && bVar.f152538i && (wVar = kVar.f108464D) != null) {
            wVar.mo44087j();
        } else if (bVar != null) {
            C62940bt r2 = C62942bv.checkIsLite(C57177h.f152645l);
            bVar.mo58887l(r2);
            if (bVar.f169962ag.mo58857o(r2.f169971d)) {
                C57143b bVar2 = kVar.f108465E;
                C62940bt r22 = C62942bv.checkIsLite(C57177h.f152645l);
                bVar2.mo58887l(r22);
                Object l = bVar2.f169962ag.mo58854l(r22.f169971d);
                if (l == null) {
                    obj = r22.f169969b;
                } else {
                    obj = r22.mo58889c(l);
                }
                kVar.f108476i.mo44063a((C57177h) obj, Optional.m71637of(imageView));
            }
        }
    }
}
