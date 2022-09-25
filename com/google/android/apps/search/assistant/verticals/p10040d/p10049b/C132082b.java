package com.google.android.apps.search.assistant.verticals.p10040d.p10049b;

import com.google.apps.tiktok.account.p3606d.C46092j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import java.io.File;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.memory.wipeout.StashAccountDataRemover$doCleanup$2", mo61344c = "StashAccountDataRemover.kt", mo61345d = "invokeSuspend", mo61346e = {22})
/* renamed from: com.google.android.apps.search.assistant.verticals.d.b.b */
/* compiled from: PG */
final class C132082b extends C69572j implements C69630p {

    /* renamed from: a */
    int f360454a;

    /* renamed from: b */
    final /* synthetic */ C132083c f360455b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C132082b(C132083c cVar, C69577g gVar) {
        super(2, gVar);
        this.f360455b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C132082b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f360454a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx b = this.f360455b.f360458c.mo50202b(C46092j.f120967a);
            C69664n.m101060f(b, "accountStorageService.ge…ountStorageService.FILES)");
            this.f360454a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        File file = (File) obj;
        C59071e eVar = C132083c.f360456a;
        file.getAbsolutePath();
        for (String str : C132083c.f360457b) {
            File file2 = new File(file, str);
            if (file2.exists()) {
                if (file2.delete()) {
                    C59052c cVar = (C59052c) C132083c.f360456a.mo56224b();
                    cVar.mo56379ah(new C59094n(39631));
                    cVar.mo56389s("Removed file %s", str);
                } else {
                    C59052c cVar2 = (C59052c) C132083c.f360456a.mo56224b();
                    cVar2.mo56379ah(new C59094n(39630));
                    cVar2.mo56389s("Failed removing file %s", str);
                }
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C132082b(this.f360455b, gVar);
    }
}
