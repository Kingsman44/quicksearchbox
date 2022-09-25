package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.p3312f.C42787k;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63088z;
import java.io.IOException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.o */
/* compiled from: PG */
public final /* synthetic */ class C125736o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C125739r f346533a;

    /* renamed from: b */
    public final /* synthetic */ C125738q f346534b;

    public /* synthetic */ C125736o(C125739r rVar, C125738q qVar) {
        this.f346533a = rVar;
        this.f346534b = qVar;
    }

    public final Object apply(Object obj) {
        C125739r rVar = this.f346533a;
        C125738q qVar = this.f346534b;
        try {
            return (C63088z) Optional.ofNullable((byte[]) rVar.f346537b.mo45889c((Uri) obj, new C42787k())).map(C125729h.f346524a).orElse(C63088z.f170246b);
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C125739r.f346536a.mo56226d()).mo56382g(e)).mo56372aa(36616)).mo56389s("Failed loading emoji nlu handler because the spoken emoji patterns file could not be opened, locale %s. [SD]", qVar.mo107094c());
            return C63088z.f170246b;
        }
    }
}
