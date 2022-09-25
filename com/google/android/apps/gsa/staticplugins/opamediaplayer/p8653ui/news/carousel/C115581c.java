package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.carousel;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.C115560ag;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115620ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28289g;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.carousel.c */
/* compiled from: PG */
public final class C115581c extends C0640fb implements C28289g {

    /* renamed from: a */
    public C28293k f320635a;

    /* renamed from: b */
    public C52176ia f320636b = C52176ia.f136911k;

    /* renamed from: c */
    public C58833ax f320637c;

    /* renamed from: d */
    private final Context f320638d;

    /* renamed from: e */
    private final C22871g f320639e;

    /* renamed from: f */
    private final C115620ah f320640f;

    /* renamed from: g */
    private final C115560ag f320641g;

    public C115581c(Context context, C22871g gVar, C115560ag agVar, C115620ah ahVar) {
        this.f320638d = context;
        this.f320639e = gVar;
        this.f320640f = ahVar;
        this.f320641g = agVar;
        setHasStableIds(true);
    }

    /* renamed from: a */
    public final C28293k mo33782a() {
        return this.f320635a;
    }

    public final int getItemCount() {
        return this.f320636b.f136914b.size();
    }

    public final long getItemId(int i) {
        return (long) ((C52174hz) this.f320636b.f136914b.get(i)).f136895b.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        r9 = (com.google.android.libraries.logging.C28293k) r2.f76909b.get(r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(android.support.p033v7.widget.C0673gh r8, int r9) {
        /*
            r7 = this;
            if (r9 < 0) goto L_0x00d6
            com.google.assistant.e.j.ia r0 = r7.f320636b
            com.google.protobuf.cq r0 = r0.f136914b
            int r0 = r0.size()
            if (r9 >= r0) goto L_0x00d6
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.carousel.e r8 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.carousel.C115583e) r8
            com.google.assistant.e.j.ia r0 = r7.f320636b
            com.google.protobuf.cq r0 = r0.f136914b
            java.lang.Object r0 = r0.get(r9)
            com.google.assistant.e.j.hz r0 = (com.google.assistant.p3897e.p3921j.C52174hz) r0
            com.google.assistant.e.j.wo r0 = r0.f136897d
            if (r0 != 0) goto L_0x001e
            com.google.assistant.e.j.wo r0 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x001e:
            com.google.common.base.ax r1 = r7.f320637c
            com.google.android.libraries.logging.k r2 = r7.f320635a
            android.widget.ImageView r3 = r8.f320650f
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.carousel.d r4 = new com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.carousel.d
            r4.<init>(r8, r9, r1)
            r3.setOnClickListener(r4)
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.ThumbnailView r1 = r8.f320649e
            java.lang.String r3 = r0.f138000g
            com.google.assistant.e.c.c.dc r4 = r0.f138004k
            if (r4 != 0) goto L_0x0036
            com.google.assistant.e.c.c.dc r4 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0036:
            com.google.android.libraries.gsa.k.g r5 = r8.f320645a
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.ah r6 = r8.f320646b
            r1.mo102127a(r3, r4, r5, r6)
            com.google.common.b.hd r1 = r8.f320647c
            int r3 = r0.f137996c
            r4 = 18
            if (r3 != r4) goto L_0x004a
            java.lang.Object r3 = r0.f137997d
            com.google.assistant.e.j.wu r3 = (com.google.assistant.p3897e.p3921j.C52574wu) r3
            goto L_0x004c
        L_0x004a:
            com.google.assistant.e.j.wu r3 = com.google.assistant.p3897e.p3921j.C52574wu.f138026h
        L_0x004c:
            int r3 = r3.f138033f
            com.google.assistant.e.j.wt r3 = com.google.assistant.p3897e.p3921j.C52573wt.m86652a(r3)
            if (r3 != 0) goto L_0x0056
            com.google.assistant.e.j.wt r3 = com.google.assistant.p3897e.p3921j.C52573wt.UNSPECIFIED
        L_0x0056:
            boolean r1 = r1.containsKey(r3)
            r3 = 0
            if (r1 == 0) goto L_0x0085
            com.google.common.b.hd r1 = r8.f320647c
            int r5 = r0.f137996c
            if (r5 != r4) goto L_0x0068
            java.lang.Object r0 = r0.f137997d
            com.google.assistant.e.j.wu r0 = (com.google.assistant.p3897e.p3921j.C52574wu) r0
            goto L_0x006a
        L_0x0068:
            com.google.assistant.e.j.wu r0 = com.google.assistant.p3897e.p3921j.C52574wu.f138026h
        L_0x006a:
            int r0 = r0.f138033f
            com.google.assistant.e.j.wt r0 = com.google.assistant.p3897e.p3921j.C52573wt.m86652a(r0)
            if (r0 != 0) goto L_0x0074
            com.google.assistant.e.j.wt r0 = com.google.assistant.p3897e.p3921j.C52573wt.UNSPECIFIED
        L_0x0074:
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.widget.TextView r1 = r8.f320648d
            r1.setText(r0)
            android.view.View r0 = r8.f320651g
            r0.setVisibility(r3)
            goto L_0x008c
        L_0x0085:
            android.view.View r0 = r8.f320651g
            r1 = 8
            r0.setVisibility(r1)
        L_0x008c:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r2 == 0) goto L_0x00d6
            com.google.android.libraries.logging.a r2 = (com.google.android.libraries.logging.C28257a) r2
            java.util.List r0 = r2.f76909b
            int r0 = r0.size()
            if (r0 >= r9) goto L_0x009b
            goto L_0x00d6
        L_0x009b:
            java.util.List r0 = r2.f76909b
            java.lang.Object r9 = r0.get(r9)
            com.google.android.libraries.logging.k r9 = (com.google.android.libraries.logging.C28293k) r9
            com.google.android.libraries.logging.j r0 = r9.mo33745a()
            if (r0 == 0) goto L_0x00d6
            android.view.View r1 = r8.itemView
            r2 = 22
            r0.mo33795i(r2)
            com.google.android.libraries.logging.C28295m.m52919e(r1, r0)
            java.util.List r0 = r9.mo33746b()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00d6
            java.util.List r9 = r9.mo33746b()
            java.lang.Object r9 = r9.get(r3)
            com.google.android.libraries.logging.k r9 = (com.google.android.libraries.logging.C28293k) r9
            com.google.android.libraries.logging.j r9 = r9.mo33745a()
            if (r9 == 0) goto L_0x00d6
            android.widget.ImageView r8 = r8.f320650f
            r0 = 5
            r9.mo33795i(r0)
            com.google.android.libraries.logging.C28295m.m52919e(r8, r9)
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.carousel.C115581c.onBindViewHolder(android.support.v7.widget.gh, int):void");
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C115583e(LayoutInflater.from(this.f320638d).inflate(R.layout.news_media_player_item, viewGroup, false), this.f320638d, this.f320639e, this.f320640f, this.f320641g);
    }
}
