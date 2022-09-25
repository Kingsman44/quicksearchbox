package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122301a;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.base.C58838bb;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;
import p3186j$.util.OptionalLong;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.m */
/* compiled from: PG */
final class C122286m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f339085a;

    /* renamed from: b */
    final /* synthetic */ String f339086b;

    /* renamed from: c */
    final /* synthetic */ boolean f339087c;

    /* renamed from: d */
    final /* synthetic */ C122290q f339088d;

    public C122286m(C122290q qVar, String str, String str2, boolean z) {
        this.f339088d = qVar;
        this.f339085a = str;
        this.f339086b = str2;
        this.f339087c = z;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C122290q.f339104a.mo56226d()).mo56382g(th)).mo56372aa(34722)).mo56389s("Error while retrieving debug stats for group %s", this.f339085a);
        this.f339088d.mo105592b("DEBUG_STATUS_ERROR", this.f339086b, this.f339085a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C122219ae aeVar;
        C122220af afVar;
        List list = (List) obj;
        C58838bb.m90890y(list.size() == 4, "Impossible to retrieve all the stats for %s %s", this.f339085a, this.f339086b);
        long orElse = ((OptionalLong) list.get(0)).orElse(0);
        long orElse2 = ((OptionalLong) list.get(1)).orElse(0);
        C58485gu guVar = (C58485gu) list.get(2);
        boolean booleanValue = ((Boolean) list.get(3)).booleanValue();
        int size = guVar.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            int a = C122301a.m201821a((C58485gu) guVar.get(i));
            int i2 = a;
            int i3 = i;
            int i4 = size;
            C58485gu guVar2 = guVar;
            this.f339088d.mo105593c(this.f339086b, this.f339085a, this.f339087c, guVar.size(), i2, orElse2);
            z = z || i2 == C122301a.PENDING_DOWNLOAD.f339151h;
            i = i3 + 1;
            size = i4;
            guVar = guVar2;
        }
        C58485gu guVar3 = guVar;
        if (guVar3.isEmpty()) {
            this.f339088d.mo105593c(this.f339086b, this.f339085a, this.f339087c, guVar3.size(), C122301a.NO_SUCH_GROUP.f339151h, orElse2);
        }
        C122290q qVar = this.f339088d;
        String str = this.f339086b;
        String str2 = this.f339085a;
        boolean z2 = this.f339087c;
        int size2 = guVar3.size();
        C122221ag agVar = qVar.f339110g;
        if (orElse2 <= ((long) agVar.f338945c)) {
            aeVar = C122219ae.BELOW_EXTREMELY_LOW;
        } else if (orElse2 <= ((long) agVar.f338949g)) {
            aeVar = C122219ae.CLOSE_TO_EXTREMELY_LOW;
        } else if (orElse2 <= ((long) agVar.f338944b)) {
            aeVar = C122219ae.BELOW_LOW;
        } else if (orElse2 <= ((long) agVar.f338948f)) {
            aeVar = C122219ae.CLOSE_TO_LOW;
        } else if (orElse2 <= ((long) agVar.f338943a)) {
            aeVar = C122219ae.BELOW_NORMAL;
        } else if (orElse2 <= ((long) agVar.f338947e)) {
            aeVar = C122219ae.CLOSE_TO_NORMAL;
        } else {
            aeVar = C122219ae.ENOUGH_SPACE;
        }
        C122221ag agVar2 = qVar.f339110g;
        float f = (float) orElse2;
        float f2 = (float) orElse;
        if (f <= agVar2.f338946d * f2) {
            afVar = C122220af.BELOW_THRESHOLD;
        } else if (f <= f2 * agVar2.f338950h) {
            afVar = C122220af.CLOSE_TO_THRESHOLD;
        } else {
            afVar = C122220af.ENOUGH_SPACE;
        }
        String str3 = qVar.f339106c;
        Boolean valueOf = Boolean.valueOf(z2);
        Integer valueOf2 = Integer.valueOf(size2);
        Boolean valueOf3 = Boolean.valueOf(z);
        Boolean valueOf4 = Boolean.valueOf(qVar.f339109f.isPresent());
        Long valueOf5 = Long.valueOf(orElse2);
        Long valueOf6 = Long.valueOf(orElse);
        Boolean valueOf7 = Boolean.valueOf(booleanValue);
        ((C58970a) ((C58970a) C122290q.f339104a.mo56224b()).mo56372aa(34723)).mo56367T("incrementApaDataDownloadStoreExtendedStatusNotFound(appVersion = %s, locale = %s, groupName = %s, accountScoped = %s, foundGroups = %s, pendingFilegroup = %s, localGroupsAvailable = %s, freeBytes = %s, totalBytes = %s, availableSpace = %s, fractionSpace = %s, workProfile = %s)", str3, str, str2, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, aeVar, afVar, valueOf7);
        ((C19567d) qVar.f339105b.f102810U.mo6453a()).mo24822a(1, qVar.f339106c, C58890d.m90988c(str), str2, valueOf3, valueOf7, afVar.f338942d, aeVar.f338937h);
    }
}
