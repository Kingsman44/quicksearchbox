package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import com.google.android.apps.gsa.nga.shared.p6274a.C80060f;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protos.p4850an.p4853b.C63357a;
import com.google.protos.p4850an.p4853b.C63358b;
import com.google.protos.p4850an.p4853b.C63361e;
import com.google.protos.p4850an.p4853b.C63363g;
import com.google.protos.p4850an.p4853b.C63365i;
import java.util.Calendar;
import java.util.Locale;
import p3186j$.time.Instant;
import p3186j$.time.LocalDateTime;
import p3186j$.time.ZoneId;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.p */
/* compiled from: PG */
public final class C122605p {

    /* renamed from: a */
    private static final C58974d f339776a = C58974d.m91136j();

    /* renamed from: a */
    public static C63358b m202014a(C80060f fVar, Instant instant, ZoneId zoneId) {
        C63363g gVar;
        C80060f fVar2 = fVar;
        long epochMilli = instant.toEpochMilli();
        Calendar instance = Calendar.getInstance(DesugarTimeZone.getTimeZone(zoneId.getId()));
        instance.setTimeInMillis(epochMilli);
        boolean z = false;
        int i = 1;
        boolean z2 = fVar2.f219698a != -1;
        boolean z3 = fVar2.f219699b != -1;
        boolean z4 = fVar2.f219700c != -1;
        boolean z5 = fVar2.f219702e != -1;
        boolean z6 = fVar2.f219703f != -1;
        boolean z7 = fVar2.f219704g != -1;
        boolean z8 = fVar2.f219701d;
        ChronoUnit chronoUnit = ChronoUnit.FOREVER;
        if (z2) {
            instance.set(1, fVar2.f219698a);
        }
        if (z3) {
            instance.set(2, fVar2.f219699b - 1);
        } else if (!z4 && !z5 && !z6 && !z7) {
            instance.set(2, 0);
        }
        if (z4) {
            instance.set(5, fVar2.f219700c);
        } else if (!z5 && !z6 && !z7) {
            instance.set(5, 1);
        }
        if (z5) {
            instance.set(11, fVar2.f219702e);
        } else if (!z6 && !z7) {
            instance.set(11, 0);
        }
        if (z6) {
            instance.set(12, fVar2.f219703f);
        } else if (!z7) {
            instance.set(12, 0);
        }
        if (z7) {
            instance.set(13, fVar2.f219704g);
        } else {
            instance.set(13, 0);
        }
        instance.set(14, 0);
        if (instance.getTimeInMillis() < epochMilli && z5 && !fVar2.f219701d) {
            m202016c(instance, 11, 12, epochMilli);
        }
        if (instance.getTimeInMillis() < epochMilli && !z2 && z3) {
            m202016c(instance, 1, 1, epochMilli);
        }
        int i2 = C122590aj.f339761a;
        LocalDateTime localDateTime = Instant.ofEpochMilli(instance.getTimeInMillis()).atZone(zoneId).mo43202c();
        C63357a aVar = (C63357a) C63358b.f171216l.createBuilder();
        int year = localDateTime.getYear();
        aVar.copyOnWrite();
        C63358b bVar = (C63358b) aVar.instance;
        bVar.f171218a |= 1;
        bVar.f171219b = year;
        try {
            int i3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}[localDateTime.getMonthValue()];
            aVar.copyOnWrite();
            C63358b bVar2 = (C63358b) aVar.instance;
            int i4 = i3 - 1;
            if (i3 != 0) {
                bVar2.f171220c = i4;
                bVar2.f171218a |= 2;
                int dayOfMonth = localDateTime.getDayOfMonth();
                aVar.copyOnWrite();
                C63358b bVar3 = (C63358b) aVar.instance;
                bVar3.f171218a = 4 | bVar3.f171218a;
                bVar3.f171221d = dayOfMonth;
                if (fVar2.f219702e >= 0 || fVar2.f219703f >= 0 || fVar2.f219704g >= 0) {
                    int hour = localDateTime.getHour();
                    aVar.copyOnWrite();
                    C63358b bVar4 = (C63358b) aVar.instance;
                    bVar4.f171218a |= 16;
                    bVar4.f171222e = hour;
                }
                if (fVar2.f219703f >= 0) {
                    int minute = localDateTime.getMinute();
                    aVar.copyOnWrite();
                    C63358b bVar5 = (C63358b) aVar.instance;
                    bVar5.f171218a |= 32;
                    bVar5.f171223f = minute;
                }
                if (fVar2.f219704g >= 0) {
                    int second = localDateTime.getSecond();
                    aVar.copyOnWrite();
                    C63358b bVar6 = (C63358b) aVar.instance;
                    bVar6.f171218a |= 64;
                    bVar6.f171224g = second;
                }
                String id = zoneId.getId();
                aVar.copyOnWrite();
                C63358b bVar7 = (C63358b) aVar.instance;
                id.getClass();
                bVar7.f171218a |= 512;
                bVar7.f171225h = id;
                C63361e eVar = (C63361e) C63365i.f171246d.createBuilder();
                if (fVar2.f219702e >= 0 || fVar2.f219703f >= 0 || fVar2.f219704g >= 0) {
                    z = true;
                }
                if (!fVar2.f219701d && z) {
                    if (localDateTime.getHour() == fVar2.f219702e) {
                        gVar = C63363g.HOUR_AMBIGUOUS_ORIGINAL;
                    } else {
                        gVar = C63363g.HOUR_AMBIGUOUS_INFERRED;
                    }
                    eVar.copyOnWrite();
                    C63365i iVar = (C63365i) eVar.instance;
                    iVar.f171250c = gVar.f171244e;
                    iVar.f171248a |= 2;
                }
                if (fVar2.f219701d && z) {
                    C63363g gVar2 = C63363g.HOUR_UNAMBIGUOUS;
                    eVar.copyOnWrite();
                    C63365i iVar2 = (C63365i) eVar.instance;
                    iVar2.f171250c = gVar2.f171244e;
                    iVar2.f171248a |= 2;
                }
                if (fVar2.f219698a < 0) {
                    eVar.copyOnWrite();
                    C63365i iVar3 = (C63365i) eVar.instance;
                    iVar3.f171249b = 1;
                    iVar3.f171248a |= 1;
                }
                if (fVar2.f219699b < 0) {
                    eVar.copyOnWrite();
                    C63365i iVar4 = (C63365i) eVar.instance;
                    iVar4.f171249b = 2;
                    iVar4.f171248a |= 1;
                }
                if (fVar2.f219700c < 0) {
                    eVar.copyOnWrite();
                    C63365i iVar5 = (C63365i) eVar.instance;
                    iVar5.f171249b = 3;
                    iVar5.f171248a |= 1;
                }
                C63365i iVar6 = (C63365i) eVar.build();
                aVar.copyOnWrite();
                C63358b bVar8 = (C63358b) aVar.instance;
                iVar6.getClass();
                bVar8.f171226i = iVar6;
                bVar8.f171218a |= 1024;
                C63365i iVar7 = bVar8.f171226i;
                if (iVar7 == null) {
                    iVar7 = C63365i.f171246d;
                }
                C63363g a = C63363g.m96228a(iVar7.f171250c);
                if (a == null) {
                    a = C63363g.HOUR_NONE;
                }
                if (a != C63363g.HOUR_UNAMBIGUOUS) {
                    i = 2;
                }
                aVar.copyOnWrite();
                C63358b bVar9 = (C63358b) aVar.instance;
                bVar9.f171228k = i - 1;
                bVar9.f171218a |= 4096;
                return (C63358b) aVar.build();
            }
            throw null;
        } catch (ArrayIndexOutOfBoundsException e) {
            ((C58970a) ((C58970a) ((C58970a) f339776a.mo56225c()).mo56382g(e)).mo56372aa(34915)).mo56387q("LocalDateTime returned invalid month: %d", localDateTime.getMonthValue());
        }
    }

    /* renamed from: b */
    public static String m202015b(C80080z zVar) {
        if (zVar == C80080z.WEBREF) {
            return "entity";
        }
        if (zVar == C80080z.PERSON_NAME) {
            zVar = C80080z.CONTACT;
        }
        return zVar.name().toLowerCase(Locale.ENGLISH);
    }

    /* renamed from: c */
    private static boolean m202016c(Calendar calendar, int i, int i2, long j) {
        calendar.add(i, i2);
        if (calendar.getTimeInMillis() >= j) {
            return true;
        }
        calendar.add(i, -i2);
        return false;
    }
}
