package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2058bx;
import androidx.core.p098j.C2059by;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52407qp;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.protobuf.C63041ff;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protobuf.p4750c.C62953e;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.am */
/* compiled from: PG */
final class C132466am extends C0640fb {

    /* renamed from: a */
    final /* synthetic */ C132467an f361561a;

    public C132466am(C132467an anVar) {
        this.f361561a = anVar;
    }

    public final int getItemCount() {
        C52176ia b = this.f361561a.f361564c.f361586a.mo110700b();
        if (b == null) {
            return 0;
        }
        return b.f136914b.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C132465al alVar = (C132465al) ghVar;
        C52176ia b = this.f361561a.f361564c.f361586a.mo110700b();
        b.getClass();
        C52174hz hzVar = (C52174hz) b.f136914b.get(i);
        TextView textView = alVar.f361553a;
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        textView.setText(woVar.f137998e);
        C63041ff ffVar = (C63041ff) C63042fg.f170152c.createBuilder();
        C52568wo woVar2 = hzVar.f136897d;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        C52407qp qpVar = woVar2.f138005l;
        if (qpVar == null) {
            qpVar = C52407qp.f137523d;
        }
        long j = qpVar.f137526b;
        ffVar.copyOnWrite();
        ((C63042fg) ffVar.instance).f170154a = j;
        C52568wo woVar3 = hzVar.f136897d;
        if (woVar3 == null) {
            woVar3 = C52568wo.f137992v;
        }
        C52407qp qpVar2 = woVar3.f138005l;
        if (qpVar2 == null) {
            qpVar2 = C52407qp.f137523d;
        }
        int i2 = qpVar2.f137527c;
        ffVar.copyOnWrite();
        ((C63042fg) ffVar.instance).f170155b = i2;
        alVar.f361555c.setText(this.f361561a.f361564c.f361597l.mo110771b(C62950b.m95474e(C62953e.m95482g(ffVar))));
        C132478ay ayVar = this.f361561a.f361564c;
        C52568wo woVar4 = hzVar.f136897d;
        if (woVar4 == null) {
            woVar4 = C52568wo.f137992v;
        }
        C51012dc dcVar = woVar4.f138004k;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        ayVar.mo110763a(dcVar.f132817c, alVar.f361554b);
        C132506x xVar = alVar.f361557e;
        C52568wo woVar5 = hzVar.f136897d;
        if (woVar5 == null) {
            woVar5 = C52568wo.f137992v;
        }
        xVar.mo110786a(woVar5);
        C52176ia b2 = this.f361561a.f361564c.f361586a.mo110700b();
        b2.getClass();
        C52174hz a = this.f361561a.f361564c.f361586a.mo110699a();
        a.getClass();
        if (a.f136895b.equals(((C52174hz) b2.f136914b.get(i)).f136895b)) {
            alVar.f361554b.setAlpha(0.2f);
            C132480b bVar = alVar.f361559g;
            if (bVar.f361604b || bVar.f361603a.getVisibility() != 0) {
                C2043bi.m5595x(bVar.f361603a).mo5199a();
                bVar.f361603a.setAlpha(0.0f);
                bVar.f361603a.setVisibility(0);
                C2058bx x = C2043bi.m5595x(bVar.f361603a);
                x.mo5201c(1.0f);
                x.mo5202d(400);
                x.mo5206h();
                x.mo5203e((C2059by) null);
                x.mo5200b();
            }
            if ((this.f361561a.f361564c.f361595j.getResources().getConfiguration().uiMode & 48) == 32) {
                View view = alVar.itemView;
                C132478ay ayVar2 = this.f361561a.f361564c;
                view.setBackgroundColor(ayVar2.f361596k.getColor(R.color.gm3_dark_default_color_on_surface, ayVar2.f361595j.getTheme()));
            } else {
                View view2 = alVar.itemView;
                C132478ay ayVar3 = this.f361561a.f361564c;
                view2.setBackgroundColor(ayVar3.f361596k.getColor(R.color.gm3_default_color_on_surface, ayVar3.f361595j.getTheme()));
            }
            alVar.itemView.getBackground().setAlpha(31);
            alVar.f361558f.f361526b = this.f361561a.f361562a;
            return;
        }
        C132480b bVar2 = alVar.f361559g;
        if (!bVar2.f361604b && bVar2.f361603a.getVisibility() == 0) {
            C2043bi.m5595x(bVar2.f361603a).mo5199a();
            C2058bx x2 = C2043bi.m5595x(bVar2.f361603a);
            x2.mo5201c(0.0f);
            x2.mo5202d(400);
            x2.mo5206h();
            x2.mo5203e(new C132453a(bVar2));
            x2.mo5200b();
        }
        alVar.f361558f.f361526b = false;
        alVar.f361554b.setAlpha(1.0f);
        alVar.itemView.setBackgroundColor(0);
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C132465al(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.assistant_news_player_playlist_item, viewGroup, false));
    }
}
