package com.google.android.libraries.p590as.p593b.p594a.p595a;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42788l;
import com.google.common.base.C58817ah;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.speech.p5218j.p5219a.C66710an;
import com.google.speech.p5218j.p5219a.C66711ao;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.libraries.as.b.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C10781a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C10782b f35791a;

    /* renamed from: b */
    public final /* synthetic */ C66710an f35792b;

    public /* synthetic */ C10781a(C10782b bVar, C66710an anVar) {
        this.f35791a = bVar;
        this.f35792b = anVar;
    }

    public final Object apply(Object obj) {
        C10782b bVar = this.f35791a;
        C66710an anVar = this.f35792b;
        C29690f fVar = (C29690f) obj;
        if (fVar == null || fVar.f80416g.size() == 0) {
            ((C58970a) ((C58970a) C10782b.f35793a.mo56226d()).mo56372aa(53953)).mo56386p("No downloaded contextual models.");
            return (C66711ao) anVar.build();
        }
        int i = fVar.f80414e;
        anVar.copyOnWrite();
        C66711ao aoVar = (C66711ao) anVar.instance;
        C66711ao aoVar2 = C66711ao.f181474d;
        aoVar.f181476a |= 2;
        aoVar.f181478c = i;
        String str = ((C28595b) fVar.f80416g.get(0)).f77799c;
        if (BuildConfig.FLAVOR.equals(str)) {
            ((C58970a) ((C58970a) C10782b.f35793a.mo56226d()).mo56372aa(53957)).mo56386p("Empty file URI in client file group.");
            return (C66711ao) anVar.build();
        }
        try {
            C42813k kVar = bVar.f35796d;
            Uri parse = Uri.parse(str);
            C42788l lVar = new C42788l();
            lVar.f112052a = true;
            File file = (File) kVar.mo45889c(parse, lVar);
            if (file == null) {
                ((C58970a) ((C58970a) C10782b.f35793a.mo56226d()).mo56372aa(53956)).mo56386p("Empty file from reading Mobstore URI.");
                return (C66711ao) anVar.build();
            }
            String parent = file.getParent();
            if (!C58837ba.m90859h(parent)) {
                anVar.copyOnWrite();
                C66711ao aoVar3 = (C66711ao) anVar.instance;
                parent.getClass();
                aoVar3.f181476a |= 1;
                aoVar3.f181477b = parent;
            }
            return (C66711ao) anVar.build();
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) C10782b.f35793a.mo56226d()).mo56382g(e)).mo56372aa(53955)).mo56386p("Mobstore URI dereference failed for client file group.");
            return (C66711ao) anVar.build();
        }
    }
}
