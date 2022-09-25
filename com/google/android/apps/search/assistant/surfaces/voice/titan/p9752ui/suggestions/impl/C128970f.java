package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.impl;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.media.C47449e;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.suggestions.impl.f */
/* compiled from: PG */
public final class C128970f extends C0640fb {

    /* renamed from: a */
    public static final C59071e f354372a = C59071e.m91331h();

    /* renamed from: b */
    public final C47449e f354373b;

    /* renamed from: c */
    public final C128972h f354374c;

    /* renamed from: d */
    public final C129024a f354375d;

    /* renamed from: e */
    public final PackageManager f354376e;

    /* renamed from: f */
    public C58485gu f354377f;

    public C128970f(C47449e eVar, C128972h hVar, C129024a aVar, PackageManager packageManager) {
        C69664n.m101061g(eVar, "imageManager");
        C69664n.m101061g(packageManager, "packageManager");
        this.f354373b = eVar;
        this.f354374c = hVar;
        this.f354375d = aVar;
        this.f354376e = packageManager;
        C58485gu m = C58485gu.m89845m();
        C69664n.m101060f(m, "of()");
        this.f354377f = m;
    }

    public final int getItemCount() {
        return this.f354377f.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        int i2;
        C128968d dVar = (C128968d) ghVar;
        C69664n.m101061g(dVar, "holder");
        Object obj = this.f354377f.get(i);
        C69664n.m101060f(obj, "chipsContents[position]");
        C51992gr grVar = (C51992gr) obj;
        C69664n.m101061g(grVar, "suggestion");
        if ((grVar.f136447a & 8) != 0) {
            dVar.f354368c.setText(grVar.f136451e);
        } else {
            dVar.f354368c.setText(BuildConfig.FLAVOR);
        }
        String str = null;
        boolean z = true;
        if ((grVar.f136447a & 16) != 0) {
            C51012dc dcVar = grVar.f136452f;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            C69664n.m101060f(dcVar, "suggestion.image");
            boolean z2 = (grVar.f136447a & 8) != 0;
            int i3 = dcVar.f132815a;
            if ((i3 & 2) != 0) {
                str = dcVar.f132817c;
            } else if ((i3 & 32) != 0) {
                try {
                    ApplicationInfo applicationInfo = dVar.f354369d.f354376e.getApplicationInfo(dcVar.f132821g, 0);
                    C69664n.m101060f(applicationInfo, "packageManager.getApplic…age.appIconIdentifier, 0)");
                    i2 = applicationInfo.icon;
                } catch (PackageManager.NameNotFoundException e) {
                    C59052c cVar = (C59052c) ((C59052c) f354372a.mo56226d()).mo56382g(e);
                    String str2 = dcVar.f132821g;
                    cVar.mo56379ah(new C59094n(38072));
                    cVar.mo56389s("Failed to obtain ApplicationInfo for %s", str2);
                    i2 = 0;
                }
                String str3 = dcVar.f132821g;
                C69664n.m101060f(str3, "image.appIconIdentifier");
                str = "android.resource://" + str3 + "/" + i2;
            }
            if (str != null && !C69664n.m101066l(dVar.f354366a, str)) {
                dVar.f354366a = str;
                dVar.f354369d.f354373b.mo51286a().mo11870h(Uri.parse(str)).mo12439a(new C128967c(dVar, z2)).mo12456t(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
            }
        } else {
            dVar.f354368c.mo47719t(false);
            dVar.f354368c.mo47694q((Drawable) null);
        }
        int i4 = grVar.f136447a;
        boolean z3 = (i4 & 8) != 0;
        if ((i4 & 16) == 0) {
            z = false;
        }
        dVar.mo108779a(z3, z);
        C51992gr grVar2 = dVar.f354367b;
        if ((grVar2.f136447a & 4) != 0 && !C69664n.m101066l(grVar2, grVar)) {
            C28306ab.m52929e(dVar.f354368c);
        }
        dVar.f354367b = grVar;
        if ((grVar.f136447a & 4) != 0) {
            dVar.f354369d.f354375d.mo108810b(grVar.f136450d, dVar.f354368c);
        }
        dVar.f354368c.setOnClickListener(new C128966b(grVar, dVar.f354369d, dVar));
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.assistant_voice_plate_suggestions_chip, viewGroup, false);
        C69664n.m101060f(inflate, "viewOfChip");
        return new C128968d(this, inflate);
    }
}
