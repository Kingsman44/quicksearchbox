package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115620ah;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115625am;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115640p;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115648x;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52407qp;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52579wz;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.aa */
/* compiled from: PG */
final class C115652aa extends C115640p {

    /* renamed from: b */
    private static C58833ax f320832b = C58836b.f156633a;

    /* renamed from: a */
    public final C115648x f320833a;

    /* renamed from: c */
    private final Context f320834c;

    /* renamed from: d */
    private final TextView f320835d;

    /* renamed from: e */
    private final TextView f320836e;

    /* renamed from: f */
    private final ThumbnailView f320837f;

    /* renamed from: g */
    private final C21370a f320838g;

    /* renamed from: h */
    private final C22871g f320839h;

    /* renamed from: i */
    private final C115620ah f320840i;

    /* renamed from: j */
    private final ImageView f320841j;

    /* renamed from: k */
    private final ImageView f320842k;

    /* renamed from: l */
    private final ProgressBar f320843l;

    /* renamed from: m */
    private final View f320844m;

    public C115652aa(View view, Context context, C21370a aVar, C22871g gVar, C115620ah ahVar, C115648x xVar) {
        super(view);
        this.f320844m = view;
        this.f320834c = context;
        this.f320838g = aVar;
        this.f320839h = gVar;
        this.f320840i = ahVar;
        this.f320833a = xVar;
        this.f320835d = (TextView) view.findViewById(R.id.speakr_media_item_title);
        this.f320836e = (TextView) view.findViewById(R.id.speakr_media_item_subtitle);
        this.f320837f = (ThumbnailView) view.findViewById(R.id.speakr_media_item_thumbnail);
        this.f320843l = (ProgressBar) view.findViewById(R.id.speakr_buffering_spinner);
        this.f320841j = (ImageView) view.findViewById(R.id.speakr_media_item_equalizer_animation);
        this.f320842k = (ImageView) view.findViewById(R.id.speakr_media_item_equalizer_background);
    }

    /* renamed from: a */
    public final void mo102131a(int i, C52174hz hzVar, C115466j jVar) {
        C51012dc dcVar;
        C58833ax axVar;
        C58833ax axVar2;
        C52583xc xcVar;
        C52583xc xcVar2;
        C52583xc xcVar3;
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        String str = woVar.f137998e;
        this.f320835d.setText(str);
        ThumbnailView thumbnailView = this.f320837f;
        try {
            C51012dc dcVar2 = woVar.f138004k;
            if (dcVar2 == null) {
                dcVar2 = C51012dc.f132813k;
            }
            if (dcVar2.f132819e.mo59031d() == 0) {
                if (!f320832b.mo56113h()) {
                    C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
                    C63088z F = C63088z.m96144F(this.f320844m.getResources().openRawResource(R.raw.article));
                    dbVar.copyOnWrite();
                    C51012dc dcVar3 = (C51012dc) dbVar.instance;
                    F.getClass();
                    dcVar3.f132815a |= 8;
                    dcVar3.f132819e = F;
                    f320832b = C58833ax.m90834k((C51012dc) dbVar.build());
                }
                dcVar = (C51012dc) f320832b.mo56107c();
            } else {
                dcVar = woVar.f138004k;
                if (dcVar == null) {
                    dcVar = C51012dc.f132813k;
                }
            }
        } catch (IOException unused) {
            dcVar = woVar.f138004k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
        }
        thumbnailView.mo102127a(str, dcVar, this.f320839h, this.f320840i);
        TextView textView = this.f320836e;
        C52568wo woVar2 = hzVar.f136897d;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        if ((woVar2.f137994a & 4096) != 0) {
            C52407qp qpVar = woVar2.f138005l;
            if (qpVar == null) {
                qpVar = C52407qp.f137523d;
            }
            axVar = C58833ax.m90834k(C115625am.m191766a(TimeUnit.SECONDS.toMillis(qpVar.f137526b), this.f320838g.mo26870b(), this.f320834c));
        } else {
            axVar = C58836b.f156633a;
        }
        if (woVar2.f137996c == 26) {
            C52583xc xcVar4 = (C52583xc) woVar2.f137997d;
            if ((xcVar4.f138065a & 16) != 0) {
                C62910ar arVar = xcVar4.f138070f;
                if (arVar == null) {
                    arVar = C62910ar.f169858c;
                }
                if (!arVar.equals(C62910ar.f169858c)) {
                    if (woVar2.f137996c == 26) {
                        xcVar3 = (C52583xc) woVar2.f137997d;
                    } else {
                        xcVar3 = C52583xc.f138063o;
                    }
                    C62910ar arVar2 = xcVar3.f138070f;
                    if (arVar2 == null) {
                        arVar2 = C62910ar.f169858c;
                    }
                    long j = arVar2.f169860a;
                    axVar2 = C58833ax.m90834k((j / 60) + this.f320834c.getResources().getString(R.string.omp_speakr_media_item_duration_left_suffix));
                }
            }
            if (woVar2.f137996c == 26) {
                xcVar2 = (C52583xc) woVar2.f137997d;
            } else {
                xcVar2 = C52583xc.f138063o;
            }
            C62910ar arVar3 = xcVar2.f138068d;
            if (arVar3 == null) {
                arVar3 = C62910ar.f169858c;
            }
            long j2 = arVar3.f169860a;
            axVar2 = C58833ax.m90834k((j2 / 60) + this.f320834c.getResources().getString(R.string.omp_speakr_media_item_duration_suffix));
        } else {
            axVar2 = C58836b.f156633a;
        }
        String str2 = woVar2.f138006m;
        boolean h = axVar.mo56113h();
        String str3 = BuildConfig.FLAVOR;
        String concat = h ? " • ".concat(String.valueOf((String) axVar.mo56107c())) : str3;
        if (axVar2.mo56113h()) {
            str3 = " • ".concat(String.valueOf((String) axVar2.mo56107c()));
        }
        textView.setText(str2 + concat + str3);
        this.f320836e.setTextAppearance(this.f320834c, R.style.OmpMediaPlayerSmallerSubtitleFullyRead);
        this.itemView.setOnClickListener(new C115829y(this, i));
        C58833ax a = C115485b.m191567a(hzVar);
        boolean z = a.mo56113h() && ((String) a.mo56107c()).equals(jVar.f320319n);
        AnimationDrawable animationDrawable = (AnimationDrawable) this.f320841j.getDrawable();
        if (!z) {
            C52568wo woVar3 = hzVar.f136897d;
            if (woVar3 == null) {
                woVar3 = C52568wo.f137992v;
            }
            if (woVar3.f137996c == 26) {
                xcVar = (C52583xc) woVar3.f137997d;
            } else {
                xcVar = C52583xc.f138063o;
            }
            C52579wz a2 = C52579wz.m86656a(xcVar.f138066b);
            if (a2 == null) {
                a2 = C52579wz.UNKNOWN_READ_STATE;
            }
            if (a2 == C52579wz.READ) {
                this.f320835d.setTextAppearance(this.f320834c, R.style.OmpMediaItemShowTitleFullyRead);
            } else {
                this.f320835d.setTextAppearance(this.f320834c, R.style.OmpMediaItemShowTitleUxRefresh);
            }
            this.f320841j.setVisibility(8);
            this.f320842k.setVisibility(8);
            this.f320843l.setVisibility(8);
            animationDrawable.stop();
            return;
        }
        this.f320837f.setOnClickListener(new C115830z(this));
        this.f320835d.setTextAppearance(this.f320834c, R.style.OmpMediaItemShowTitleSelected);
        if (jVar.f320311f) {
            this.f320843l.setVisibility(0);
            this.f320843l.setContentDescription(this.f320834c.getResources().getString(R.string.omp_playlist_equalizer_buffering));
            this.f320841j.setVisibility(8);
        } else if (jVar.f320310e) {
            this.f320841j.setContentDescription(this.f320834c.getResources().getString(R.string.omp_playlist_equalizer_playing));
            animationDrawable.start();
            this.f320841j.setVisibility(0);
            this.f320843l.setVisibility(8);
        } else if (jVar.f320309d) {
            this.f320841j.setContentDescription(this.f320834c.getResources().getString(R.string.omp_playlist_equalizer_paused));
            animationDrawable.stop();
            this.f320841j.setVisibility(0);
            this.f320843l.setVisibility(8);
        }
        this.f320842k.setVisibility(0);
    }
}
