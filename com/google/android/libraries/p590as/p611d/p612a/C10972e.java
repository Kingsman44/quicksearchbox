package com.google.android.libraries.p590as.p611d.p612a;

import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.as.d.a.e */
/* compiled from: PG */
public final /* synthetic */ class C10972e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C10973f f36102a;

    public /* synthetic */ C10972e(C10973f fVar) {
        this.f36102a = fVar;
    }

    public final Object call() {
        C10973f fVar = this.f36102a;
        ((C59052c) ((C59052c) C10973f.f36103a.mo56224b()).mo56372aa(54063)).mo56386p("#initializeLanguages");
        fVar.f36105c = (C10971d) ((C10970c) ((C10971d) ProtoParsers.m95525h(fVar.f36104b, C10971d.f36099b.getParserForType(), R.raw.languages_data_pb)).toBuilder()).build();
        return fVar.f36105c;
    }
}
