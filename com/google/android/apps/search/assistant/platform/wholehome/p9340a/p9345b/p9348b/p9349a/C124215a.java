package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.p9349a;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124186b;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124189e;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124190f;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124205u;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124206v;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124207w;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124209y;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124210z;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.C124214a;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.assistant.p3741aa.C48170e;
import com.google.assistant.p3741aa.C48171f;
import com.google.assistant.p3741aa.C48172g;
import com.google.assistant.p3741aa.C48173h;
import com.google.common.p4580v.C60945d;
import com.google.protobuf.C63088z;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C124215a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124218d f342982a;

    /* renamed from: b */
    public final /* synthetic */ C124190f f342983b;

    public /* synthetic */ C124215a(C124218d dVar, C124190f fVar) {
        this.f342982a = dVar;
        this.f342983b = fVar;
    }

    public final void run() {
        C124189e eVar;
        C124206v vVar;
        C124218d dVar = this.f342982a;
        C124190f fVar = this.f342983b;
        int i = fVar.f342947a;
        int i2 = i != 0 ? i != 1 ? i != 5 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            dVar.f342994c.set(C124214a.ESTABLISHED);
            AtomicReference atomicReference = dVar.f342995d;
            if (fVar.f342947a == 1) {
                eVar = (C124189e) fVar.f342948b;
            } else {
                eVar = C124189e.f342942b;
            }
            C124186b bVar = eVar.f342944a;
            if (bVar == null) {
                bVar = C124186b.f342938c;
            }
            atomicReference.set(bVar);
            C17597g gVar = dVar.f342993b;
            C124207w wVar = (C124207w) C124210z.f342970c.createBuilder();
            C124209y yVar = C124209y.f342968a;
            wVar.copyOnWrite();
            C124210z zVar = (C124210z) wVar.instance;
            yVar.getClass();
            zVar.f342973b = yVar;
            zVar.f342972a = 1;
            gVar.mo20123c((C124210z) wVar.build());
            dVar.f342996e.run();
        } else if (i3 == 1) {
            if (i == 5) {
                vVar = (C124206v) fVar.f342948b;
            } else {
                vVar = C124206v.f342964c;
            }
            String str = vVar.f342966a;
            if (dVar.f342997f.containsKey(str)) {
                C124217c cVar = (C124217c) dVar.f342997f.get(str);
                C124205u uVar = (C124205u) C124206v.f342964c.createBuilder();
                uVar.copyOnWrite();
                str.getClass();
                ((C124206v) uVar.instance).f342966a = str;
                C48170e eVar2 = (C48170e) C48173h.f124650e.createBuilder();
                C48173h hVar = vVar.f342967b;
                if (hVar == null) {
                    hVar = C48173h.f124650e;
                }
                C63088z zVar2 = hVar.f124655d;
                eVar2.copyOnWrite();
                C48173h hVar2 = (C48173h) eVar2.instance;
                zVar2.getClass();
                hVar2.f124652a |= 2;
                hVar2.f124655d = zVar2;
                C48173h hVar3 = vVar.f342967b;
                if (hVar3 == null) {
                    hVar3 = C48173h.f124650e;
                }
                C48171f fVar2 = (C48171f) ((C48172g) hVar3.f124654c.get(0)).toBuilder();
                String str2 = cVar.f342986a;
                fVar2.copyOnWrite();
                C48172g gVar2 = (C48172g) fVar2.instance;
                str2.getClass();
                gVar2.f124645a = 1 | gVar2.f124645a;
                gVar2.f124646b = str2;
                long c = C60945d.m93098c(cVar.f342987b);
                fVar2.copyOnWrite();
                C48172g gVar3 = (C48172g) fVar2.instance;
                gVar3.f124645a = 2 | gVar3.f124645a;
                gVar3.f124649e = c;
                eVar2.mo53143a(fVar2);
                uVar.copyOnWrite();
                C48173h hVar4 = (C48173h) eVar2.build();
                hVar4.getClass();
                ((C124206v) uVar.instance).f342967b = hVar4;
                C124206v vVar2 = (C124206v) uVar.build();
                C2164c cVar2 = cVar.f342988c;
                if (cVar2 != null) {
                    cVar2.mo5437b(vVar2);
                    dVar.f342997f.remove(str);
                    return;
                }
                throw new IllegalStateException("responseCompleter is null.");
            }
            throw new IllegalStateException(String.format(Locale.ENGLISH, "Failed to find onRemoteExecutionCompleter for id: %s.", new Object[]{str}));
        } else {
            throw new IllegalArgumentException("Unsupported message was received.");
        }
    }
}
