package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.appannotator;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.annotators.v;
import com.google.android.apps.gsa.nga.engine.annotators.w;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.storage.p3304a.p3312f.C42789m;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4242bp.p4257f.C56218b;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.appannotator.j */
/* compiled from: PG */
public final /* synthetic */ class C122680j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ AppAnnotatorFactory f339940a;

    public /* synthetic */ C122680j(AppAnnotatorFactory appAnnotatorFactory) {
        this.f339940a = appAnnotatorFactory;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        AppAnnotatorFactory appAnnotatorFactory = this.f339940a;
        C29690f fVar = (C29690f) obj;
        Uri parse = Uri.parse(((C28595b) Collection.EL.stream(fVar.f80416g).filter(C122683m.f339944a).findFirst().orElseThrow(C122684n.f339945a)).f77799c);
        try {
            optional = Optional.m71637of((MessageLite) appAnnotatorFactory.f339925c.mo45889c(parse, new C42789m(C56218b.f149746a.getParserForType())));
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) AppAnnotatorFactory.f339923a.mo56225c()).mo56382g(e)).mo56372aa(34884)).mo56389s("Cannot read or parse from uri %s", parse);
            optional = Optional.empty();
        }
        C56218b bVar = (C56218b) optional.orElseThrow(C122685o.f339946a);
        appAnnotatorFactory.f339930h.mo105804a(Optional.m71637of(fVar.f80411b));
        v createBuilder = w.d.createBuilder();
        createBuilder.copyOnWrite();
        w wVar = createBuilder.instance;
        bVar.getClass();
        wVar.b = bVar;
        wVar.a |= 1;
        createBuilder.copyOnWrite();
        w wVar2 = createBuilder.instance;
        wVar2.a |= 2;
        wVar2.c = false;
        AppAnnotatorFactory.nativeUpdateAppAnnotator(createBuilder.build().toByteArray());
        return C60866ct.f164955a;
    }
}
