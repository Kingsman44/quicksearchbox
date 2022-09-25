package com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a;

import com.google.speech.p5218j.p5219a.C66700ad;
import com.google.speech.p5218j.p5219a.C66706aj;
import com.google.speech.p5218j.p5219a.C66707ak;
import com.google.speech.p5218j.p5219a.C66713aq;
import com.google.speech.p5218j.p5219a.C66718av;
import com.google.speech.p5218j.p5219a.C66720ax;
import com.google.speech.p5218j.p5219a.C66754u;
import p5462h.C69685i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.b.a.a */
/* compiled from: PG */
public final class C32256a {
    /* renamed from: a */
    public static final C69685i m60038a(String str, int i) {
        C69664n.m101061g(str, "name");
        return new C69685i("contextInput-".concat(String.valueOf(str)), Integer.valueOf(i));
    }

    /* renamed from: b */
    public static final C69685i m60039b(String str, int i) {
        C69664n.m101061g(str, "name");
        return new C69685i("feature-".concat(String.valueOf(str)), Integer.valueOf(i));
    }

    /* renamed from: c */
    public static final int m60040c(C66707ak akVar) {
        C66700ad adVar;
        C66706aj ajVar;
        C69664n.m101061g(akVar, "contextInput");
        if (akVar.f181461b == 3) {
            adVar = (C66700ad) akVar.f181462c;
        } else {
            adVar = C66700ad.f181439d;
        }
        int size = adVar.f181443c.size();
        if (akVar.f181461b == 2) {
            ajVar = (C66706aj) akVar.f181462c;
        } else {
            ajVar = C66706aj.f181455b;
        }
        return Math.max(size, ajVar.f181457a.size());
    }

    /* renamed from: d */
    public static final int m60041d(C66713aq aqVar) {
        C66754u uVar;
        C66718av avVar;
        C66720ax axVar;
        C69664n.m101061g(aqVar, "feature");
        if (aqVar.f181481a == 1) {
            uVar = (C66754u) aqVar.f181482b;
        } else {
            uVar = C66754u.f181563b;
        }
        int size = uVar.f181565a.size();
        if (aqVar.f181481a == 2) {
            avVar = (C66718av) aqVar.f181482b;
        } else {
            avVar = C66718av.f181487b;
        }
        int size2 = avVar.f181489a.size();
        if (aqVar.f181481a == 3) {
            axVar = (C66720ax) aqVar.f181482b;
        } else {
            axVar = C66720ax.f181490b;
        }
        return Math.max(size, Math.max(size2, axVar.f181492a.size()));
    }
}
