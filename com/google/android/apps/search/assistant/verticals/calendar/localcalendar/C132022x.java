package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import android.database.Cursor;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.p10037a.C131946a;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.p10037a.C131947b;
import com.google.common.p4522b.C58330ba;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58517hz;
import com.google.common.p4522b.C58732py;
import com.google.common.p4543n.p4545b.C59364ae;
import com.google.common.p4543n.p4545b.C59369c;
import com.google.common.p4543n.p4545b.C59370d;
import com.google.common.p4543n.p4545b.C59374h;
import com.google.common.p4543n.p4545b.C59376j;
import com.google.common.util.concurrent.C60809aq;
import com.google.common.util.concurrent.C60813au;
import com.google.common.util.concurrent.C60817ay;
import java.util.AbstractMap;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collector;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.x */
/* compiled from: PG */
public final /* synthetic */ class C132022x implements C60809aq {

    /* renamed from: a */
    public final /* synthetic */ C60817ay f360365a;

    /* renamed from: b */
    public final /* synthetic */ C60817ay f360366b;

    public /* synthetic */ C132022x(C60817ay ayVar, C60817ay ayVar2) {
        this.f360365a = ayVar;
        this.f360366b = ayVar2;
    }

    /* renamed from: a */
    public final Object mo51504a(C60813au auVar) {
        C60817ay ayVar = this.f360365a;
        C60817ay ayVar2 = this.f360366b;
        Cursor cursor = (Cursor) auVar.mo57269a(ayVar);
        Stream.Builder builder = Stream.CC.builder();
        while (true) {
            boolean z = false;
            if (!cursor.moveToNext()) {
                break;
            }
            long j = cursor.getLong(cursor.getColumnIndex("calendar_id"));
            if (cursor.getInt(cursor.getColumnIndex("allDay")) == 1) {
                z = true;
            }
            builder.add(new AbstractMap.SimpleImmutableEntry(Long.valueOf(j), Boolean.valueOf(z)));
        }
        C59364ae m = C59364ae.m92267m(builder.build());
        Function identity = Function.CC.identity();
        Collector d = C58370cn.m89404d(Function.CC.identity(), C58330ba.f155903a);
        identity.getClass();
        C59369c cVar = new C59369c(identity);
        C59370d.f157571a.getClass();
        d.getClass();
        C58495hd h = ((C59364ae) m.mo56896f(new C59374h(cVar, new C59376j(d)))).mo56899h();
        Cursor cursor2 = (Cursor) auVar.mo57269a(ayVar2);
        C58480gp e = C58485gu.m89837e();
        while (cursor2.moveToNext()) {
            long j2 = cursor2.getLong(cursor2.getColumnIndex("_id"));
            String string = cursor2.getString(cursor2.getColumnIndex("account_name"));
            String string2 = cursor2.getString(cursor2.getColumnIndex("account_type"));
            String string3 = cursor2.getString(cursor2.getColumnIndex("ownerAccount"));
            boolean z2 = cursor2.getInt(cursor2.getColumnIndex("isPrimary")) == 1;
            boolean z3 = cursor2.getInt(cursor2.getColumnIndex("visible")) == 1;
            if (!(string3 == null || string == null || string2 == null)) {
                C131946a aVar = (C131946a) C131947b.f360260j.createBuilder();
                aVar.copyOnWrite();
                C131947b bVar = (C131947b) aVar.instance;
                bVar.f360262a |= 1;
                bVar.f360263b = string3;
                aVar.copyOnWrite();
                C131947b bVar2 = (C131947b) aVar.instance;
                bVar2.f360262a |= 2;
                bVar2.f360264c = string;
                aVar.copyOnWrite();
                C131947b bVar3 = (C131947b) aVar.instance;
                bVar3.f360262a |= 4;
                bVar3.f360265d = string2;
                aVar.copyOnWrite();
                C131947b bVar4 = (C131947b) aVar.instance;
                bVar4.f360262a |= 16;
                bVar4.f360267f = z2;
                aVar.copyOnWrite();
                C131947b bVar5 = (C131947b) aVar.instance;
                bVar5.f360262a |= 32;
                bVar5.f360268g = z3;
                C58517hz hzVar = (C58517hz) h.getOrDefault(Long.valueOf(j2), C58732py.f156492a);
                int lv = hzVar.mo54932lv(false);
                aVar.copyOnWrite();
                C131947b bVar6 = (C131947b) aVar.instance;
                bVar6.f360262a |= 64;
                bVar6.f360269h = lv;
                int lv2 = hzVar.mo54932lv(true);
                aVar.copyOnWrite();
                C131947b bVar7 = (C131947b) aVar.instance;
                bVar7.f360262a |= 128;
                bVar7.f360270i = lv2;
                e.mo55395g((C131947b) aVar.build());
            }
        }
        return e.mo55394f();
    }
}
