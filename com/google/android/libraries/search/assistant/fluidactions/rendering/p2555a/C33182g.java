package com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a;

import com.google.assistant.p3897e.p3921j.p3926e.C51934en;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51942ev;
import com.google.assistant.p3897e.p3921j.p3926e.C51943ew;
import com.google.assistant.p3897e.p3921j.p3926e.C51944ex;
import com.google.assistant.p3897e.p3921j.p3926e.C51948fa;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.a.g */
/* compiled from: PG */
public final class C33182g {

    /* renamed from: a */
    private C51953ff f88749a;

    /* renamed from: b */
    private final ReentrantLock f88750b = new ReentrantLock();

    public C33182g(C51953ff ffVar) {
        C69664n.m101061g(ffVar, "showNativeFormArgs");
        this.f88749a = ffVar;
    }

    /* renamed from: a */
    public final C51953ff mo38576a() {
        ReentrantLock reentrantLock = this.f88750b;
        reentrantLock.lock();
        try {
            return this.f88749a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public final List mo38577b() {
        ReentrantLock reentrantLock = this.f88750b;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            C62971cq cqVar = this.f88749a.f136319c;
            C69664n.m101060f(cqVar, "showNativeFormArgs.subSectionsList");
            ArrayList arrayList2 = new ArrayList();
            for (Object next : cqVar) {
                if (true ^ ((C51948fa) next).f136298c) {
                    arrayList2.add(next);
                }
            }
            int i = 0;
            for (Object next2 : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    C69540x.m100952j();
                }
                C62971cq cqVar2 = ((C51948fa) next2).f136299d;
                C69664n.m101060f(cqVar2, "formSubSection.formFieldGroupList");
                ArrayList arrayList3 = new ArrayList();
                for (Object next3 : cqVar2) {
                    if (!((C51943ew) next3).f136290d) {
                        arrayList3.add(next3);
                    }
                }
                int i3 = 0;
                for (Object next4 : arrayList3) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        C69540x.m100952j();
                    }
                    C62971cq cqVar3 = ((C51943ew) next4).f136288b;
                    C69664n.m101060f(cqVar3, "formFieldGroup.formFieldList");
                    ArrayList arrayList4 = new ArrayList();
                    for (Object next5 : cqVar3) {
                        if (!((C51941eu) next5).f136281i) {
                            arrayList4.add(next5);
                        }
                    }
                    int i5 = 0;
                    for (Object next6 : arrayList4) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            C69540x.m100952j();
                        }
                        C51941eu euVar = (C51941eu) next6;
                        arrayList.add(C69540x.m100947e(Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i5)));
                        i5 = i6;
                    }
                    i3 = i4;
                }
                i = i2;
            }
            return arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public final List mo38578c() {
        ReentrantLock reentrantLock = this.f88750b;
        reentrantLock.lock();
        try {
            List<C51948fa> e = mo38580e();
            ArrayList arrayList = new ArrayList();
            for (C51948fa faVar : e) {
                C62971cq cqVar = faVar.f136299d;
                C69664n.m101060f(cqVar, "it.formFieldGroupList");
                ArrayList arrayList2 = new ArrayList();
                for (Object next : cqVar) {
                    if (!((C51943ew) next).f136290d) {
                        arrayList2.add(next);
                    }
                }
                C69540x.m100811r(arrayList, arrayList2);
            }
            return arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public final List mo38579d() {
        ReentrantLock reentrantLock = this.f88750b;
        reentrantLock.lock();
        try {
            List<C51943ew> c = mo38578c();
            ArrayList arrayList = new ArrayList();
            for (C51943ew ewVar : c) {
                C62971cq cqVar = ewVar.f136288b;
                C69664n.m101060f(cqVar, "it.formFieldList");
                ArrayList arrayList2 = new ArrayList();
                for (Object next : cqVar) {
                    if (!((C51941eu) next).f136281i) {
                        arrayList2.add(next);
                    }
                }
                C69540x.m100811r(arrayList, arrayList2);
            }
            return arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public final List mo38580e() {
        ReentrantLock reentrantLock = this.f88750b;
        reentrantLock.lock();
        try {
            C62971cq cqVar = this.f88749a.f136319c;
            C69664n.m101060f(cqVar, "showNativeFormArgs.subSectionsList");
            ArrayList arrayList = new ArrayList();
            for (Object next : cqVar) {
                if (!((C51948fa) next).f136298c) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: f */
    public final void mo38581f(C51941eu euVar) {
        C69664n.m101061g(euVar, "updatedFormField");
        ReentrantLock reentrantLock = this.f88750b;
        reentrantLock.lock();
        try {
            C62934bn builder = this.f88749a.toBuilder();
            C69664n.m101060f(builder, "showNativeFormArgs.toBuilder()");
            C51934en enVar = (C51934en) builder;
            enVar.copyOnWrite();
            ((C51953ff) enVar.instance).f136319c = C51953ff.emptyProtobufList();
            C62971cq<C51948fa> cqVar = this.f88749a.f136319c;
            C69664n.m101060f(cqVar, "showNativeFormArgs.subSectionsList");
            for (C51948fa faVar : cqVar) {
                C62934bn builder2 = faVar.toBuilder();
                C69664n.m101060f(builder2, "formSubSection.toBuilder()");
                C51944ex exVar = (C51944ex) builder2;
                exVar.copyOnWrite();
                ((C51948fa) exVar.instance).f136299d = C51948fa.emptyProtobufList();
                C62971cq<C51943ew> cqVar2 = faVar.f136299d;
                C69664n.m101060f(cqVar2, "formSubSection.formFieldGroupList");
                for (C51943ew ewVar : cqVar2) {
                    C62934bn builder3 = ewVar.toBuilder();
                    C69664n.m101060f(builder3, "formFieldGroup.toBuilder()");
                    C51942ev evVar = (C51942ev) builder3;
                    evVar.copyOnWrite();
                    ((C51943ew) evVar.instance).f136288b = C51943ew.emptyProtobufList();
                    C62971cq<C51941eu> cqVar3 = ewVar.f136288b;
                    C69664n.m101060f(cqVar3, "formFieldGroup.formFieldList");
                    for (C51941eu euVar2 : cqVar3) {
                        if ((euVar2.f136273a & 8) == 0 || (euVar.f136273a & 8) == 0 || !C69664n.m101066l(euVar2.f136279g, euVar.f136279g)) {
                            evVar.mo53759b(euVar2);
                        } else {
                            evVar.mo53759b(euVar);
                        }
                    }
                    exVar.mo53762a(evVar);
                }
                enVar.mo53754a(exVar);
            }
            C62942bv build = enVar.build();
            C69664n.m101060f(build, "showNativeFormArgsBuilder.build()");
            this.f88749a = (C51953ff) build;
        } finally {
            reentrantLock.unlock();
        }
    }
}
