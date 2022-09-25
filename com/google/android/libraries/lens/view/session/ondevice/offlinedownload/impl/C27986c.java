package com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl;

import com.google.android.libraries.lens.view.p2067ak.C25199ae;
import com.google.android.libraries.lens.view.p2067ak.C25246by;
import com.google.android.libraries.lens.view.p2069am.C25321bb;
import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60866ct;
import java.util.Collection;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl.c */
/* compiled from: PG */
public final /* synthetic */ class C27986c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ OfflineDownloadManagerImpl f76183a;

    public /* synthetic */ C27986c(OfflineDownloadManagerImpl offlineDownloadManagerImpl) {
        this.f76183a = offlineDownloadManagerImpl;
    }

    public final Object apply(Object obj) {
        OfflineDownloadManagerImpl offlineDownloadManagerImpl = this.f76183a;
        Collection<C25321bb> collection = (Collection) obj;
        if (offlineDownloadManagerImpl.f76167n == null) {
            ((C58970a) ((C58970a) OfflineDownloadManagerImpl.f76145a.mo56224b()).mo56372aa(50078)).mo56386p("Read user prefs to init queue");
            offlineDownloadManagerImpl.f76155b.clear();
            C25246by byVar = ((C25199ae) offlineDownloadManagerImpl.f76163j.f68662a.mo30362b(true)).f68635h;
            if (byVar == null) {
                byVar = C25246by.f68705c;
            }
            ((C58970a) ((C58970a) OfflineDownloadManagerImpl.f76145a.mo56224b()).mo56372aa(50081)).mo56393w("Loading %d queued language packs and %d background packs", byVar.f68707a.size(), byVar.f68708b.size());
            for (String forLanguageTag : byVar.f68707a) {
                Locale forLanguageTag2 = Locale.forLanguageTag(forLanguageTag);
                offlineDownloadManagerImpl.mo33448u(forLanguageTag2, C25327c.QUEUED);
                offlineDownloadManagerImpl.mo33449v(forLanguageTag2, C25327c.QUEUED);
                offlineDownloadManagerImpl.f76155b.put(forLanguageTag2, C28005v.DOWNLOAD_TYPE_FOREGROUND);
            }
            for (String forLanguageTag3 : byVar.f68708b) {
                Locale forLanguageTag4 = Locale.forLanguageTag(forLanguageTag3);
                offlineDownloadManagerImpl.mo33448u(forLanguageTag4, C25327c.BACKGROUND_QUEUED);
                offlineDownloadManagerImpl.mo33449v(forLanguageTag4, C25327c.BACKGROUND_QUEUED);
                offlineDownloadManagerImpl.f76155b.put(forLanguageTag4, C28005v.DOWNLOAD_TYPE_BACKGROUND);
            }
            offlineDownloadManagerImpl.f76167n = C60866ct.f164955a;
            offlineDownloadManagerImpl.f76161h.mo30904h(new C27989f(offlineDownloadManagerImpl), true);
        }
        offlineDownloadManagerImpl.f76156c.put(Locale.ENGLISH, C25327c.PERMANENT);
        for (C25321bb bbVar : collection) {
            Locale forLanguageTag5 = Locale.forLanguageTag(bbVar.f68894a);
            C25327c a = C25327c.m46663a(bbVar.f68895b);
            if (a == null) {
                a = C25327c.UNRECOGNIZED;
            }
            if (offlineDownloadManagerImpl.f76155b.containsKey(forLanguageTag5)) {
                int ordinal = a.ordinal();
                if (ordinal == 1) {
                    a = offlineDownloadManagerImpl.mo33452y(forLanguageTag5) ? C25327c.QUEUED : C25327c.BACKGROUND_QUEUED;
                } else if (ordinal == 5 || ordinal == 6) {
                    offlineDownloadManagerImpl.f76155b.remove(forLanguageTag5);
                    offlineDownloadManagerImpl.mo33450w();
                } else {
                    ((C58970a) ((C58970a) OfflineDownloadManagerImpl.f76145a.mo56226d()).mo56372aa(50113)).mo56387q("Unexpected state in list models response %s", a.getNumber());
                }
            }
            offlineDownloadManagerImpl.f76156c.put(forLanguageTag5, a);
        }
        C58495hd l = C58495hd.m89898l(offlineDownloadManagerImpl.f76156c);
        offlineDownloadManagerImpl.f76158e.execute(C47810es.m84977q(new C27988e(offlineDownloadManagerImpl)));
        return l;
    }
}
