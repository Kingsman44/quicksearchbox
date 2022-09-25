package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9761e.p9762a;

import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128828c;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128829d;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128834i;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.p9758a.C128808a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.p9758a.C128809b;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9761e.C128849a;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69677g;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.e.a.b */
/* compiled from: PG */
public final class C128851b implements C46851e {

    /* renamed from: a */
    final /* synthetic */ C128858i f354162a;

    public C128851b(C128858i iVar) {
        this.f354162a = iVar;
    }

    /* renamed from: a */
    public final C46691ai mo20330a() {
        C46690ah ahVar = C128849a.f354155d;
        C69664n.m101060f(ahVar, "VOICE_PLATE_AVATAR_KEY");
        return ahVar;
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        C128809b bVar = this.f354162a.f354170k;
        C128834i k = bVar.f354076d.mo108674k();
        C128834i iVar = C128834i.ASSISTANT;
        int ordinal = k.ordinal();
        if (ordinal == 0) {
            return C60856cj.m92900i(C128829d.f354115a);
        }
        if (ordinal == 1) {
            return C60856cj.m92900i(C128828c.f354114a);
        }
        if (ordinal == 2) {
            return C71663i.m104692e(bVar.f354075c, (C71424ay) null, new C128808a(bVar, (C69577g) null), 3);
        }
        throw new C69677g();
    }
}
