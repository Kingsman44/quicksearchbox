package com.google.android.apps.search.assistant.platform.p9141h.p9165i;

import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10026c;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.search.assistant.platform.p9141h.p9165i.p9166a.C121143a;
import com.google.android.apps.search.assistant.platform.p9141h.p9165i.p9166a.C121144b;
import com.google.android.apps.search.assistant.platform.p9141h.p9165i.p9166a.C121146d;
import com.google.android.apps.search.assistant.platform.p9141h.p9165i.p9166a.C121148f;
import com.google.protobuf.p4746a.C62884c;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.h.i.a */
/* compiled from: PG */
public final class C121142a {

    /* renamed from: a */
    private static final Map f336601a = C69505av.m100867i(new C69685i(C79570b.ALARM, C121143a.QP_SETTING_TYPE_ALARM), new C69685i(C79570b.TIMER, C121143a.QP_SETTING_TYPE_TIMER), new C69685i(C79570b.CALL_CONTACT, C121143a.QP_SETTING_TYPE_CALL_CONTACT), new C69685i(C79570b.CALL_CONTACT_V2, C121143a.QP_SETTING_TYPE_CALL_CONTACT_V2), new C69685i(C79570b.CALL_NUMBER, C121143a.QP_SETTING_TYPE_CALL_NUMBER), new C69685i(C79570b.CALL_NUMBER_V2, C121143a.QP_SETTING_TYPE_CALL_NUMBER_V2), new C69685i(C79570b.MEDIA, C121143a.QP_SETTING_TYPE_MEDIA));

    /* renamed from: b */
    private static final Set f336602b = C69531o.m100939p(new C79570b[]{C79570b.SYSUI_NOTIFICATION, C79570b.GRPC, C79570b.CALL, C79570b.KEYBOARD, C79570b.NOTIFICATION, C79570b.TTS});

    /* renamed from: a */
    public static final C121143a m200430a(C79570b bVar) {
        C69664n.m101061g(bVar, "<this>");
        if (f336602b.contains(bVar)) {
            return null;
        }
        C121143a aVar = (C121143a) f336601a.get(bVar);
        if (aVar != null) {
            return aVar;
        }
        String name = bVar.name();
        throw new InternalError("Classic Quick Phrase setting type " + name + " not mapped to TNG Type.");
    }

    /* renamed from: b */
    public static final C121146d m200431b(C10026c cVar) {
        C69664n.m101061g(cVar, "<this>");
        C121144b bVar = (C121144b) C121146d.f336615b.createBuilder();
        C69664n.m101060f(bVar, "newBuilder()");
        C121148f a = C69664n.m101061g(bVar, "builder");
        Map unmodifiableMap = Collections.unmodifiableMap(cVar.f34233a);
        C69664n.m101060f(unmodifiableMap, "contextTypeEnabledMap");
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            Object key = entry.getKey();
            C69664n.m101060f(key, "entry.key");
            C79570b a2 = C79570b.m127648a(((Number) key).intValue());
            C69664n.m101058d(a2);
            C121143a a3 = m200430a(a2);
            if (a3 != null) {
                Map unmodifiableMap2 = Collections.unmodifiableMap(Collections.unmodifiableMap(((C121146d) a.f336618a.instance).f336617a));
                C69664n.m101060f(unmodifiableMap2, "_builder.getEnabledSettingsMap()");
                new C62884c(unmodifiableMap2);
                int number = a3.getNumber();
                Object value = entry.getValue();
                C69664n.m101060f(value, "entry.value");
                a.f336618a.mo105062a(number, ((Boolean) value).booleanValue());
            }
        }
        return a.mo105063a();
    }
}
