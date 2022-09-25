package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14128bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14265cv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14266cw;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14268cy;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.android.libraries.assistant.p1478e.p1479a.p1480a.C17939a;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.assistant.p3745ab.p3766r.C48385a;
import com.google.assistant.p3745ab.p3766r.C48386b;
import com.google.assistant.p3745ab.p3766r.C48387c;
import com.google.assistant.p3745ab.p3766r.C48390f;
import com.google.assistant.p3745ab.p3766r.C48391g;
import com.google.assistant.p3745ab.p3766r.C48392h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.aj */
/* compiled from: PG */
public final class C15001aj extends C0640fb {

    /* renamed from: a */
    final /* synthetic */ C15005an f44964a;

    /* renamed from: b */
    private final ContextThemeWrapper f44965b;

    /* renamed from: c */
    private final boolean f44966c;

    public C15001aj(C15005an anVar, ContextThemeWrapper contextThemeWrapper, boolean z) {
        this.f44964a = anVar;
        this.f44965b = contextThemeWrapper;
        this.f44966c = z;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C15004am amVar = (C15004am) ghVar;
        ContextThemeWrapper contextThemeWrapper = this.f44965b;
        C14266cw cwVar = this.f44964a.f44984n;
        cwVar.getClass();
        C14265cv cvVar = (C14265cv) cwVar.f43162e.get(i);
        int b = C14268cy.m30587b(cvVar.f43154d);
        if (b != 0 && b == 7) {
            amVar.f44968a.setOnClickListener(new C14128bb(amVar.f44970c.f44977g, new C15003al(amVar)));
        } else {
            amVar.f44968a.setOnClickListener(new C14129bc(amVar.f44970c.f44977g, Optional.empty(), amVar));
        }
        String str = cvVar.f43152b;
        int b2 = C14268cy.m30587b(cvVar.f43154d);
        if (b2 == 0) {
            b2 = 1;
        }
        C62940bt btVar = C17939a.f51392b;
        C48385a aVar = (C48385a) C48392h.f125083c.createBuilder();
        C48390f fVar = (C48390f) C48391g.f125079c.createBuilder();
        C48386b bVar = (C48386b) C48387c.f125069d.createBuilder();
        bVar.copyOnWrite();
        C48387c cVar = (C48387c) bVar.instance;
        str.getClass();
        cVar.f125071a |= 1;
        cVar.f125072b = str;
        bVar.copyOnWrite();
        C48387c cVar2 = (C48387c) bVar.instance;
        cVar2.f125073c = C14268cy.m30586a(b2);
        cVar2.f125071a |= 2;
        fVar.copyOnWrite();
        C48391g gVar = (C48391g) fVar.instance;
        C48387c cVar3 = (C48387c) bVar.build();
        cVar3.getClass();
        gVar.f125082b = cVar3;
        gVar.f125081a = 1;
        aVar.copyOnWrite();
        C48392h hVar = (C48392h) aVar.instance;
        C48391g gVar2 = (C48391g) fVar.build();
        gVar2.getClass();
        hVar.f125087b = gVar2;
        hVar.f125086a |= 1;
        amVar.f44969b = new C28353e(btVar, (C48392h) aVar.build());
        amVar.f44968a.setText(cvVar.f43153c);
        int i2 = cvVar.f43154d;
        int b3 = C14268cy.m30587b(i2);
        if (b3 != 0 && b3 == 3) {
            Optional d = amVar.f44970c.f44976f.mo22214d(cvVar.f43152b, cvVar.f43155e);
            if (d.isPresent()) {
                Button button = amVar.f44968a;
                Drawable drawable = (Drawable) d.get();
                amVar.mo21889c(drawable, contextThemeWrapper);
                button.setCompoundDrawables((Drawable) null, drawable, (Drawable) null, (Drawable) null);
            } else {
                amVar.f44968a.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, contextThemeWrapper.getDrawable(R.drawable.explauncher_media_icon), (Drawable) null, (Drawable) null);
            }
        } else {
            int b4 = C14268cy.m30587b(i2);
            if (b4 != 0 && b4 == 5) {
                amVar.f44968a.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, contextThemeWrapper.getDrawable(R.drawable.ic_driving_safe_settings), (Drawable) null, (Drawable) null);
            } else {
                int b5 = C14268cy.m30587b(i2);
                if (b5 != 0 && b5 == 7) {
                    amVar.f44968a.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, contextThemeWrapper.getDrawable(R.drawable.pay_for_gas_icon), (Drawable) null, (Drawable) null);
                } else {
                    try {
                        Drawable applicationIcon = amVar.f44970c.f44974d.getApplicationIcon(cvVar.f43152b);
                        Button button2 = amVar.f44968a;
                        amVar.mo21889c(applicationIcon, contextThemeWrapper);
                        button2.setCompoundDrawables((Drawable) null, applicationIcon, (Drawable) null, (Drawable) null);
                    } catch (PackageManager.NameNotFoundException e) {
                        C59104x c = C15005an.f44971a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "Morris.ExpLaunchRndr");
                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(45952)).mo56386p("button setCompoundDrawables failed");
                    }
                }
            }
        }
        if (this.f44966c) {
            amVar.itemView.startAnimation(C15352z.m31955g(this.f44964a.f44972b, (i / 3) + 3));
        }
        amVar.mo21470a();
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C15004am(this.f44964a, LayoutInflater.from(this.f44965b).inflate(R.layout.experience_launcher_button, viewGroup, false));
    }

    public final /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        ((C15004am) ghVar).mo21471b();
    }

    public final int getItemCount() {
        C14266cw cwVar = this.f44964a.f44984n;
        cwVar.getClass();
        return cwVar.f43162e.size();
    }
}
