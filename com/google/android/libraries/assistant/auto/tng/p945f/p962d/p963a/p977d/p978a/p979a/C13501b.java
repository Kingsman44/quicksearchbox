package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.p979a;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13499a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13510c;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13512e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p980b.C13516a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59052c;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C13501b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C13502c f41421a;

    public /* synthetic */ C13501b(C13502c cVar) {
        this.f41421a = cVar;
    }

    public final Object apply(Object obj) {
        String str;
        C13502c cVar = this.f41421a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h() || axVar.mo56107c() == null) {
            C13510c l = C13512e.m29782l();
            ((C13499a) l).f41418k = 3;
            return l.mo21131a();
        }
        Location location = (Location) axVar.mo56107c();
        if (location.getProvider() == null || !location.hasAccuracy() || location.getTime() == 0 || location.getElapsedRealtimeNanos() == 0) {
            C13510c l2 = C13512e.m29782l();
            ((C13499a) l2).f41418k = 4;
            return l2.mo21131a();
        }
        C13510c l3 = C13512e.m29782l();
        Location location2 = (Location) axVar.mo56107c();
        Context context = cVar.f41426e;
        Object[] objArr = new Object[1];
        Locale locale = cVar.f41424c;
        if (location2 == null) {
            ((C59052c) ((C59052c) C13516a.f41451a.mo56226d()).mo56372aa(44883)).mo56386p("Placemark's location is empty");
            str = null;
        } else {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("https");
            builder.appendEncodedPath("/maps.google.com");
            String format = String.format(locale, "?q=%.6f,%.6f", new Object[]{Double.valueOf(location2.getLatitude()), Double.valueOf(location2.getLongitude())});
            String language = locale.getLanguage();
            String c = C58890d.m90988c(locale.getCountry());
            builder.appendEncodedPath(format + "&hl=" + language + "&gl=" + c + "&entry=gps");
            str = builder.toString();
        }
        objArr[0] = str;
        String string = context.getString(R.string.share_location_message, objArr);
        if (string != null) {
            C13499a aVar = (C13499a) l3;
            aVar.f41409b = string;
            aVar.f41418k = 8;
            return l3.mo21131a();
        }
        throw new NullPointerException("Null messageString");
    }
}
