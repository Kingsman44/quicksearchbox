package com.google.android.apps.gsa.staticplugins.p8793w.p8794a;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.p6968aa.C89036bg;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.common.p4526f.C59052c;
import com.google.p4486ci.p4487a.C58097b;
import com.google.p4486ci.p4487a.C58100e;
import com.google.p4486ci.p4487a.C58112q;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.a.ag */
/* compiled from: PG */
final class C117685ag implements C89036bg {

    /* renamed from: a */
    public C117684af f326643a;

    /* renamed from: e */
    public final void mo17963e(C89062r rVar) {
        C117684af afVar;
        if (rVar.mo83040a() && (afVar = this.f326643a) != null) {
            C117683ae aeVar = (C117683ae) afVar;
            if (!aeVar.f326642e.f326654k.get() && !TextUtils.isEmpty(aeVar.f326641d)) {
                C117687ai aiVar = aeVar.f326642e;
                String str = aeVar.f326641d;
                C58097b bVar = aeVar.f326638a;
                aiVar.f326654k.set(true);
                C58112q qVar = new C58112q(str, "PUT", (C58100e) null, bVar, (String) null, true);
                C117683ae aeVar2 = aiVar.f326657n;
                if (aeVar2 != null) {
                    qVar.mo54663f(aeVar2, 1048576);
                } else {
                    ((C59052c) ((C59052c) C117687ai.f326644a.mo56225c()).mo56372aa(18610)).mo56386p("Can't append listener to audio reupload because audioUploaderListener is null");
                }
                C90875ai.m148465b(C117696j.f326672a, qVar.mo54658a(), aiVar.f326645b, "Resume Upload").mo85223a(C117697k.f326673a);
            } else if (!aeVar.f326642e.f326654k.get()) {
                ((C59052c) ((C59052c) C117687ai.f326644a.mo56225c()).mo56372aa(18584)).mo56386p("ResumeToken is empty when trying to reupload the audio file.");
                aeVar.f326642e.mo103432c(aeVar.f326638a, aeVar.f326639b, aeVar.f326640c);
            }
        }
    }
}
