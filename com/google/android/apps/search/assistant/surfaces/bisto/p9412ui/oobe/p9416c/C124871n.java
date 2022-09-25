package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c;

import android.view.View;
import android.widget.ImageView;
import androidx.core.content.p091b.C1874w;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.errorpage.C43514b;
import com.google.android.libraries.web.contrib.errorpage.C43516d;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.setupdesign.GlifLoadingLayout;
import com.google.android.setupdesign.p3555d.C45301i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.n */
/* compiled from: PG */
public final /* synthetic */ class C124871n implements C43516d {

    /* renamed from: a */
    public final /* synthetic */ C124872o f344516a;

    /* renamed from: b */
    public final /* synthetic */ View f344517b;

    public /* synthetic */ C124871n(C124872o oVar, View view) {
        this.f344516a = oVar;
        this.f344517b = view;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo46581a() {
    }

    /* renamed from: b */
    public final void mo46582b(C43376u uVar, Optional optional) {
        Object obj;
        C124872o oVar = this.f344516a;
        View view = this.f344517b;
        if (optional.isPresent()) {
            C124867j jVar = C124867j.WEBX_UNSPECIFIED;
            C43512b bVar = (C43512b) optional.get();
            C62940bt r13 = C62942bv.checkIsLite(C124868k.f344510a);
            bVar.mo58887l(r13);
            Object l = bVar.f169962ag.mo58854l(r13.f169971d);
            if (l == null) {
                obj = r13.f169969b;
            } else {
                obj = r13.mo58889c(l);
            }
            int ordinal = ((C124867j) obj).ordinal();
            int i = 8;
            if (ordinal == 0 || ordinal == 1) {
                boolean z = oVar.f344521d.f344502b.size() > 0;
                if (z && !oVar.f344519b) {
                    oVar.f344519b = true;
                    ImageView imageView = (ImageView) view.findViewById(R.id.assistant_bisto_error_image_view);
                    for (Integer intValue : oVar.f344521d.f344502b) {
                        oVar.f344523f.addFrame(C1874w.m5109f(oVar.f344522e.getResources(), intValue.intValue(), oVar.f344522e.requireContext().getTheme()), 3000);
                    }
                    imageView.setVisibility(0);
                    imageView.setImageDrawable(oVar.f344523f);
                    oVar.f344523f.start();
                }
                View findViewById = view.findViewById(R.id.assistant_bisto_webx_loading_content);
                if (true != z) {
                    i = 0;
                }
                findViewById.setVisibility(i);
            } else if (ordinal == 2) {
                GlifLoadingLayout glifLoadingLayout = (GlifLoadingLayout) view.findViewById(R.id.assistant_bisto_webx_loading_content);
                ((C45301i) glifLoadingLayout.mo49129j(C45301i.class)).mo49235c(true);
                glifLoadingLayout.setVisibility(0);
                view.findViewById(R.id.assistant_bisto_error_image_view).setVisibility(8);
            }
        } else {
            C43514b b = C43514b.m76781b(uVar);
            C59104x c = C124872o.f344518a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ErrorPageFragment");
            ((C59052c) ((C59052c) c).mo56372aa(36401)).mo56385o(b);
        }
    }
}
