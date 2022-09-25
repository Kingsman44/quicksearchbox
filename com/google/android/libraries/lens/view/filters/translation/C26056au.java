package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2069am.C25319b;
import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.android.libraries.lens.view.p2093d.C25764m;
import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.C27979b;
import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.C27980c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56299cz;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.au */
/* compiled from: PG */
final class C26056au implements C27980c {

    /* renamed from: a */
    final /* synthetic */ C26059ax f70779a;

    public C26056au(C26059ax axVar) {
        this.f70779a = axVar;
    }

    /* renamed from: a */
    public final void mo31245a(Locale locale, C25319b bVar) {
        C58495hd hdVar = (C58495hd) this.f70779a.f70831u.mo3842a();
        hdVar.getClass();
        HashMap hashMap = new HashMap(hdVar);
        hashMap.put(locale, bVar);
        this.f70779a.f70831u.mo5708l(C26059ax.m48090b(C58495hd.m89898l(hashMap)));
    }

    /* renamed from: b */
    public final void mo31246b(Locale locale, C25327c cVar) {
        C25327c cVar2;
        C58495hd hdVar = (C58495hd) this.f70779a.f70830t.mo3842a();
        if (hdVar != null) {
            HashMap hashMap = new HashMap(hdVar);
            hashMap.put(locale, cVar);
            this.f70779a.f70830t.mo5708l(C26059ax.m48090b(C58495hd.m89898l(hashMap)));
        }
        if (this.f70779a.f70799M.mo56113h()) {
            if (C26059ax.f70785b.contains(cVar)) {
                C26059ax axVar = this.f70779a;
                C58526ih ihVar = new C58526ih();
                ihVar.mo55489i((Iterable) this.f70779a.f70799M.mo56107c());
                ihVar.mo55373c(locale);
                axVar.f70799M = C58833ax.m90834k(ihVar.mo55486f());
            } else {
                C26059ax axVar2 = this.f70779a;
                axVar2.f70799M = axVar2.f70799M.mo56106b(new C26053ar(locale));
            }
        }
        C56299cz czVar = C56299cz.UNKNOWN;
        C25327c cVar3 = C25327c.UNKNOWN;
        int ordinal = cVar.ordinal();
        if (ordinal == 1) {
            this.f70779a.mo31269x(locale, 1);
        } else if (ordinal == 2 || ordinal == 3) {
            this.f70779a.mo31250e(locale);
            this.f70779a.mo31269x(locale, 3);
        } else if (ordinal == 4) {
            this.f70779a.mo31250e(locale);
            this.f70779a.mo31269x(locale, 2);
        } else if (ordinal == 5) {
            if (!this.f70779a.mo31264s()) {
                C26059ax axVar3 = this.f70779a;
                axVar3.f70836z.mo5708l(new C26123f(axVar3.f70814d.getString(R.string.lens_translate_downloaded), 118313));
            }
            this.f70779a.mo31269x(locale, 4);
        }
        C26059ax axVar4 = this.f70779a;
        if (((Locale) axVar4.f70827q.mo3842a()).equals(locale) || axVar4.mo31249d().equals(locale)) {
            C25764m mVar = axVar4.f70788B;
            C26117d dVar = new C26117d();
            dVar.mo31310b(Locale.getDefault());
            dVar.mo31309a(C25327c.UNKNOWN);
            dVar.mo31310b(locale);
            dVar.mo31309a(cVar);
            Locale locale2 = dVar.f70972a;
            if (locale2 == null || (cVar2 = dVar.f70973b) == null) {
                StringBuilder sb = new StringBuilder();
                if (dVar.f70972a == null) {
                    sb.append(" locale");
                }
                if (dVar.f70973b == null) {
                    sb.append(" downloadState");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            mVar.mo5708l(new C26122e(locale2, cVar2));
        }
    }

    /* renamed from: c */
    public final void mo31247c(Locale locale, C27979b bVar) {
        ((C58970a) ((C58970a) ((C58970a) C26059ax.f70786c.mo56226d()).mo56382g((Throwable) null)).mo56372aa(49380)).mo56354G("Failed to download language pack for %s: %s", locale, bVar);
        if (!this.f70779a.mo31264s()) {
            C26059ax axVar = this.f70779a;
            axVar.f70836z.mo5708l(new C26123f(axVar.f70814d.getString(R.string.lens_translate_download_failed), 118315));
        }
        this.f70779a.mo31269x(locale, 1);
        C26059ax axVar2 = this.f70779a;
        axVar2.f70799M = axVar2.f70799M.mo56106b(new C26052aq(locale));
    }
}
