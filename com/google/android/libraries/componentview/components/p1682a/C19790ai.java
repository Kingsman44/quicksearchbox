package com.google.android.libraries.componentview.components.p1682a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19769n;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.a.ai */
/* compiled from: PG */
public class C19790ai extends C20061bs {

    /* renamed from: a */
    private TextView f55290a;

    public C19790ai(Context context, C56425d dVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final View mo25110e(Context context) {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.immersive_header, (ViewGroup) null);
        this.f55290a = (TextView) relativeLayout.findViewById(R.id.immersive_actions_user_intent_text);
        return relativeLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19769n.f55232f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19769n nVar = (C19769n) obj;
        if ((nVar.f55234a & 1) != 0) {
            View view = this.f56305p;
            C19995r rVar = nVar.f55235b;
            if (rVar == null) {
                rVar = C19995r.f56032g;
            }
            view.setBackgroundColor(C20566at.m38590a(rVar));
        }
        this.f55290a.setText(nVar.f55236c);
        if ((nVar.f55234a & 8) != 0) {
            C19916aq aqVar = nVar.f55237d;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            mo25249w(aqVar);
        }
    }
}
