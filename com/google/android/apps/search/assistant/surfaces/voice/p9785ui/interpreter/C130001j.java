package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126985f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.base.C58852bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.j */
/* compiled from: PG */
final class C130001j implements C58852bp {

    /* renamed from: a */
    final /* synthetic */ C129868c f356523a;

    public C130001j(C129868c cVar) {
        this.f356523a = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo40846a(Object obj) {
        C34822b bVar;
        C126988i iVar = (C126988i) obj;
        C69664n.m101061g(iVar, "errorData");
        C129868c cVar = this.f356523a;
        if (!iVar.equals(C126988i.f349669h)) {
            C126985f a = C126985f.m207727a(iVar.f349676f);
            if (a == null) {
                a = C126985f.ERROR_UNKNOWN;
            }
            if (a != C126985f.ERROR_TIMEOUT) {
                C59052c cVar2 = (C59052c) C129868c.f356274a.mo56226d();
                C126985f a2 = C126985f.m207727a(iVar.f349676f);
                if (a2 == null) {
                    a2 = C126985f.ERROR_UNKNOWN;
                }
                int i = a2.f349668l;
                if (iVar.f349672b == 2) {
                    bVar = (C34822b) iVar.f349673c;
                } else {
                    bVar = C34822b.f92358d;
                }
                C34834b bVar2 = bVar.f92362c;
                if (bVar2 == null) {
                    bVar2 = C34834b.f92401c;
                }
                int i2 = bVar2.f92404b;
                cVar2.mo56379ah(new C59094n(38579));
                cVar2.mo56393w("Error encountered in Interpreter, %d, %d", i, i2);
                View view = cVar.f356278e.getView();
                if (view != null) {
                    Snackbar.m79660p(view, R.string.assistant_interpreter_snack_bar_error, 0).mo48343h();
                }
            }
        }
    }
}
