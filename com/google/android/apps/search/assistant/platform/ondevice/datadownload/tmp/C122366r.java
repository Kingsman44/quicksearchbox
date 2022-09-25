package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import androidx.core.app.C1839z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1363c.p1371b.p1376d.C17087f;
import com.google.android.libraries.assistant.p1363c.p1371b.p1376d.C17093l;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.OptionalLong;
import p3186j$.util.function.Consumer;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.r */
/* compiled from: PG */
public final /* synthetic */ class C122366r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C122348an f339268a;

    /* renamed from: b */
    public final /* synthetic */ Optional f339269b;

    /* renamed from: c */
    public final /* synthetic */ Locale f339270c;

    /* renamed from: d */
    public final /* synthetic */ C58485gu f339271d;

    /* renamed from: e */
    public final /* synthetic */ C58485gu f339272e;

    public /* synthetic */ C122366r(C122348an anVar, Optional optional, Locale locale, C58485gu guVar, C58485gu guVar2) {
        this.f339268a = anVar;
        this.f339269b = optional;
        this.f339270c = locale;
        this.f339271d = guVar;
        this.f339272e = guVar2;
    }

    public final void accept(Object obj) {
        C1839z zVar;
        C122348an anVar = this.f339268a;
        Optional optional = this.f339269b;
        Locale locale = this.f339270c;
        C58485gu guVar = this.f339271d;
        C58485gu guVar2 = this.f339272e;
        C17093l lVar = (C17093l) obj;
        OptionalLong b = lVar.mo23182b();
        OptionalLong c = lVar.mo23183c();
        if (lVar.f49744b) {
            C122360l lVar2 = anVar.f339233h;
            C17087f a = lVar.mo23181a();
            zVar = new C1839z(lVar2.f339255b, "DOWNLOAD_PROMPT_NOTIFICATION");
            zVar.f5705y = "status";
            zVar.f5685e = C1839z.m5037c(lVar2.f339255b.getString(R.string.assistant_tmp_notification_title));
            C17087f fVar = C17087f.PREPARING;
            int ordinal = a.ordinal();
            if (ordinal == 3) {
                zVar.f5686f = C1839z.m5037c(lVar2.f339255b.getString(R.string.assistant_tmp_notification_downloaded_status));
                zVar.f5679J.icon = 17301634;
            } else if (ordinal == 4) {
                zVar.f5686f = C1839z.m5037c(lVar2.f339255b.getString(R.string.assistant_tmp_notification_cancelled_status));
                zVar.f5679J.icon = 17301543;
            } else if (ordinal != 5) {
                zVar.f5686f = C1839z.m5037c(lVar2.f339255b.getString(R.string.assistant_tmp_notification_error_status));
                zVar.f5679J.icon = 17301543;
            } else {
                zVar.f5686f = C1839z.m5037c(lVar2.f339255b.getString(R.string.assistant_tmp_notification_failed_status));
                zVar.f5679J.icon = 17301543;
            }
        } else {
            zVar = anVar.f339233h.mo105604b(optional);
        }
        if (!lVar.f49744b || lVar.mo23181a().equals(C17087f.FINISHED_SUCCESS)) {
            b.orElse(-1);
            c.orElse(-1);
            boolean z = lVar.f49744b;
            lVar.mo23181a();
        } else {
            ((C59052c) ((C59052c) C122348an.f339226a.mo56226d()).mo56372aa(34769)).mo56360M("Progress update %d/%d done = %s, status = %s", Long.valueOf(b.orElse(-1)), Long.valueOf(c.orElse(-1)), Boolean.valueOf(lVar.f49744b), lVar.mo23181a());
            ((C59052c) ((C59052c) C122348an.f339226a.mo56226d()).mo56372aa(34770)).mo56359L("Error: locale = %s, groups = %s, pseudonymousGroups = %s", locale.toLanguageTag(), Collection.EL.stream(guVar).map(C122339ae.f339212a).collect(Collectors.joining(",")), Collection.EL.stream(guVar2).map(C122339ae.f339212a).collect(Collectors.joining(",")));
        }
        if (!lVar.f49744b) {
            if (b.isEmpty() || c.isEmpty()) {
                C122360l.m201848e(zVar, 0, 0, true);
            } else {
                ((C59052c) ((C59052c) C122348an.f339226a.mo56226d()).mo56372aa(34767)).mo56350C("UpdateListener: %d/%d", lVar.mo23182b().orElse(-1), lVar.mo23183c().orElse(-1));
                C122360l.m201848e(zVar, c.getAsLong(), b.getAsLong(), false);
            }
        }
        anVar.f339233h.mo105605d(zVar, lVar.f49744b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
