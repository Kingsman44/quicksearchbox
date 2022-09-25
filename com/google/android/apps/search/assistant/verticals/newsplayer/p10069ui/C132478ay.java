package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.search.assistant.verticals.newsplayer.p10068e.C132416a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52407qp;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63041ff;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protobuf.p4750c.C62953e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.ay */
/* compiled from: PG */
public final class C132478ay {

    /* renamed from: o */
    private static final C59071e f361585o = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.newsplayer.ui.ay");

    /* renamed from: a */
    public final C132416a f361586a;

    /* renamed from: b */
    public C132506x f361587b = null;

    /* renamed from: c */
    public C132467an f361588c = null;

    /* renamed from: d */
    public C132459af f361589d = null;

    /* renamed from: e */
    public C132477ax f361590e = null;

    /* renamed from: f */
    public C132471ar f361591f = null;

    /* renamed from: g */
    public C132489g f361592g = null;

    /* renamed from: h */
    public final C47770dh f361593h;

    /* renamed from: i */
    public final C47449e f361594i;

    /* renamed from: j */
    public final Context f361595j;

    /* renamed from: k */
    public final Resources f361596k;

    /* renamed from: l */
    public final C132484bd f361597l;

    /* renamed from: m */
    public final C69464a f361598m;

    /* renamed from: n */
    public final C47477n f361599n;

    /* renamed from: p */
    private final C132495m f361600p;

    /* renamed from: q */
    private final C69464a f361601q;

    public C132478ay(C132495m mVar, C132416a aVar, C47770dh dhVar, C47449e eVar, Context context, C132484bd bdVar, C47477n nVar, C69464a aVar2, C69464a aVar3) {
        this.f361600p = mVar;
        this.f361586a = aVar;
        this.f361593h = dhVar;
        this.f361594i = eVar;
        this.f361595j = context;
        this.f361596k = context.getResources();
        this.f361597l = bdVar;
        this.f361599n = nVar;
        this.f361601q = aVar2;
        this.f361598m = aVar3;
    }

    /* renamed from: a */
    public final void mo110763a(String str, ImageView imageView) {
        if (str.length() == 0) {
            ((C59052c) ((C59052c) f361585o.mo56226d()).mo56372aa(39677)).mo56386p("Not loading empty image url");
            imageView.setImageDrawable((Drawable) null);
            return;
        }
        this.f361594i.mo51286a().mo11864b().mo12448j(str).mo12454r(imageView);
    }

    /* renamed from: b */
    public final void mo110764b() {
        String str = true != ((Boolean) this.f361601q.mo17428b()).booleanValue() ? "news" : "profile_news";
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = str;
        this.f361600p.startActivityForResult(c.mo24020b().mo24031a(), 1);
    }

    /* renamed from: c */
    public final void mo110765c(C52174hz hzVar) {
        if (this.f361600p.getView() != null) {
            TextView textView = (TextView) this.f361600p.requireView().findViewById(R.id.assistant_news_player_title);
            C52568wo woVar = hzVar.f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            textView.setText(woVar.f137998e);
            TextView textView2 = (TextView) this.f361600p.requireView().findViewById(R.id.assistant_news_player_container_title);
            TextView textView3 = (TextView) this.f361600p.requireView().findViewById(R.id.assistant_news_player_publication_time_separator);
            C52568wo woVar2 = hzVar.f136897d;
            if (woVar2 == null) {
                woVar2 = C52568wo.f137992v;
            }
            if (woVar2.f138000g.isEmpty()) {
                textView2.setVisibility(8);
                textView3.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView3.setVisibility(0);
            }
            TextView textView4 = (TextView) this.f361600p.requireView().findViewById(R.id.assistant_news_player_container_title);
            C52568wo woVar3 = hzVar.f136897d;
            if (woVar3 == null) {
                woVar3 = C52568wo.f137992v;
            }
            textView4.setText(woVar3.f138000g);
            C63041ff ffVar = (C63041ff) C63042fg.f170152c.createBuilder();
            C52568wo woVar4 = hzVar.f136897d;
            if (woVar4 == null) {
                woVar4 = C52568wo.f137992v;
            }
            C52407qp qpVar = woVar4.f138005l;
            if (qpVar == null) {
                qpVar = C52407qp.f137523d;
            }
            long j = qpVar.f137526b;
            ffVar.copyOnWrite();
            ((C63042fg) ffVar.instance).f170154a = j;
            C52568wo woVar5 = hzVar.f136897d;
            if (woVar5 == null) {
                woVar5 = C52568wo.f137992v;
            }
            C52407qp qpVar2 = woVar5.f138005l;
            if (qpVar2 == null) {
                qpVar2 = C52407qp.f137523d;
            }
            int i = qpVar2.f137527c;
            ffVar.copyOnWrite();
            ((C63042fg) ffVar.instance).f170155b = i;
            ((TextView) this.f361600p.requireView().findViewById(R.id.assistant_news_player_publication_time)).setText(this.f361597l.mo110771b(C62950b.m95474e(C62953e.m95482g(ffVar))));
            ImageView imageView = (ImageView) this.f361600p.requireView().findViewById(R.id.assistant_news_player_logo);
            C52568wo woVar6 = hzVar.f136897d;
            if (woVar6 == null) {
                woVar6 = C52568wo.f137992v;
            }
            C51012dc dcVar = woVar6.f138004k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            mo110763a(dcVar.f132817c, imageView);
            C132506x xVar = this.f361587b;
            if (xVar != null) {
                C52568wo woVar7 = hzVar.f136897d;
                if (woVar7 == null) {
                    woVar7 = C52568wo.f137992v;
                }
                xVar.mo110786a(woVar7);
            }
        }
    }
}
