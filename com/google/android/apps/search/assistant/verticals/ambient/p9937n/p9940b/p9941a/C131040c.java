package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import android.app.usage.UsageEvents;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131078a;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131079b;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131082e;
import com.google.common.p4522b.C58539iu;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.c */
/* compiled from: PG */
public final /* synthetic */ class C131040c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C131051f f358450a;

    /* renamed from: b */
    public final /* synthetic */ C58539iu f358451b;

    /* renamed from: c */
    public final /* synthetic */ Map f358452c;

    public /* synthetic */ C131040c(C131051f fVar, C58539iu iuVar, Map map) {
        this.f358450a = fVar;
        this.f358451b = iuVar;
        this.f358452c = map;
    }

    public final void accept(Object obj) {
        String str;
        C131051f fVar = this.f358450a;
        C58539iu iuVar = this.f358451b;
        Map map = this.f358452c;
        UsageEvents.Event event = (UsageEvents.Event) obj;
        if (C131051f.f358478b.containsKey(Integer.valueOf(event.getEventType()))) {
            str = String.format("%s-%d", new Object[]{event.getPackageName(), Integer.valueOf(((Integer) C131051f.f358478b.getOrDefault(Integer.valueOf(event.getEventType()), 0)).intValue())});
        } else {
            str = String.format("%s-%d", new Object[]{event.getPackageName(), Integer.valueOf(event.getEventType())});
        }
        if (C131051f.f358477a.containsKey(Integer.valueOf(event.getEventType()))) {
            C131079b bVar = (C131079b) C131051f.f358477a.get(Integer.valueOf(event.getEventType()));
            if (bVar != null) {
                C131082e eVar = new C131082e();
                String packageName = event.getPackageName();
                if (packageName != null) {
                    eVar.f358534a = packageName;
                    Optional ofNullable = Optional.ofNullable(event.getClassName());
                    if (ofNullable != null) {
                        eVar.f358535b = ofNullable;
                        eVar.f358536c = bVar;
                        Instant ofEpochMilli = Instant.ofEpochMilli(event.getTimeStamp());
                        if (ofEpochMilli != null) {
                            eVar.f358537d = ofEpochMilli;
                            map.put(str, eVar);
                        } else {
                            throw new NullPointerException("Null eventStart");
                        }
                    } else {
                        throw new NullPointerException("Null packageClass");
                    }
                } else {
                    throw new NullPointerException("Null packageName");
                }
            } else {
                return;
            }
        }
        if (C131051f.f358478b.containsKey(Integer.valueOf(event.getEventType())) && map.containsKey(str)) {
            C131078a aVar = (C131078a) map.get(str);
            if (aVar == null) {
                ((C58970a) ((C58970a) fVar.f358482f.mo56226d()).mo56372aa(39016)).mo56353F("Events without corresponding start event. App: %s, event time: %d", event.getPackageName(), event.getTimeStamp());
                return;
            }
            aVar.mo110040b(Instant.ofEpochMilli(event.getTimeStamp()));
            iuVar.mo55533l(aVar.mo110039a());
            map.remove(str);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
