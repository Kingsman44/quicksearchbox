package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.assist.C9418h;
import com.google.android.apps.gsa.nga.d.a.p;
import com.google.android.apps.gsa.nga.d.a.r;
import com.google.android.apps.gsa.nga.engine.p6142u.C78007b;
import com.google.android.apps.gsa.nga.engine.screen.annotations.C77912a;
import com.google.android.apps.gsa.nga.engine.screen.annotations.C77913b;
import com.google.android.apps.gsa.nga.engine.screen.p6139a.C77911a;
import com.google.android.apps.gsa.nga.engine.screen.parser.C77947a;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80903ar;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82929fr;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82930fs;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60803ak;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.io.Closeable;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class ScreenAnnotationEngineImpl implements C77912a {

    /* renamed from: a */
    public static final C58974d f214629a = C58974d.m91136j();

    /* renamed from: b */
    public static final C58528ij f214630b = C58528ij.m90013M("com.google.android.youtube", "com.google.android.apps.youtube.music", "com.google.android.apps.youtube.kids", "com.google.android.googlequicksearchbox");

    /* renamed from: c */
    public static final C58528ij f214631c = C58528ij.m90011K("youtube.com", "youtu.be");

    /* renamed from: d */
    public final C78007b f214632d;

    /* renamed from: e */
    public final C77947a f214633e;

    /* renamed from: f */
    public final C77913b f214634f;

    /* renamed from: g */
    public final C77944x f214635g;

    /* renamed from: h */
    public final C77911a f214636h;

    /* renamed from: i */
    public final C22871g f214637i;

    /* renamed from: j */
    private final C83334w f214638j;

    /* compiled from: PG */
    public class NativeScreenContent implements Closeable {

        /* renamed from: a */
        public long f214639a = 0;

        public NativeScreenContent(C78007b bVar) {
            bVar.mo72960b();
            this.f214639a = nativeCreateScreenContent();
        }

        private static native long nativeCreateScreenContent();

        private static native void nativeDestroyScreenContent(long j);

        public final void close() {
            long j = this.f214639a;
            if (j != 0) {
                nativeDestroyScreenContent(j);
                this.f214639a = 0;
            }
        }
    }

    public ScreenAnnotationEngineImpl(C78007b bVar, C83334w wVar, C77947a aVar, C77913b bVar2, C77944x xVar, C77911a aVar2, C22871g gVar) {
        this.f214632d = bVar;
        this.f214638j = wVar;
        this.f214633e = aVar;
        this.f214634f = bVar2;
        this.f214635g = xVar;
        this.f214636h = aVar2;
        this.f214637i = gVar;
    }

    /* renamed from: c */
    private final void m125075c(String str, Optional optional) {
        mo72898b(Optional.empty(), Optional.empty(), Optional.m71637of(str), optional);
    }

    /* renamed from: a */
    public final C60870cx mo72895a(C9418h hVar, Optional optional, C58485gu guVar, C80903ar arVar) {
        if (Collection.EL.stream(hVar.f32717b).anyMatch(C77926f.f214664a)) {
            this.f214636h.f214626a.mo74271b(C89849ae.NGA_SCREEN_ANNOTATION_FRAMEWORK_CROSSWALK_DISABLED);
            m125075c("SAF disabled because of Crosswalk compliance", optional);
            return C60856cj.m92900i(r.b);
        }
        this.f214636h.f214626a.mo74271b(C89849ae.NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_START);
        if (guVar.isEmpty()) {
            this.f214636h.mo72894a();
            m125075c("No annotators specified", optional);
            return C60856cj.m92900i(r.b);
        }
        C77930j jVar = new C77930j(this);
        C60838bs g = new C60817ay((C60803ak) new C77931k(this, jVar), (Executor) jVar).mo57272e(C77932l.f214671a, C60826bg.f164896a).mo57272e(new C77933m(this, hVar), C60826bg.f164896a).mo57273f(new C77934n(this, arVar), jVar).mo57273f(new C77935o(this, optional, guVar), jVar).mo57275g();
        C22871g gVar = this.f214637i;
        C77911a aVar = this.f214636h;
        Objects.requireNonNull(aVar);
        C90875ai.m148465b(new C77936p(aVar), g, gVar, "[NGA] ScreenAnnotationEngine.parseAndAnnotate log events").mo85223a(new C77937q(this));
        return g;
    }

    /* renamed from: b */
    public final void mo72898b(Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        C82929fr frVar = (C82929fr) C82930fs.f226246e.createBuilder();
        if (optional2.isPresent()) {
            p pVar = (p) optional.get();
            frVar.copyOnWrite();
            C82930fs fsVar = (C82930fs) frVar.instance;
            pVar.getClass();
            fsVar.f226249b = pVar;
            fsVar.f226248a |= 1;
        }
        if (optional2.isPresent()) {
            r rVar = (r) optional2.get();
            frVar.copyOnWrite();
            C82930fs fsVar2 = (C82930fs) frVar.instance;
            rVar.getClass();
            fsVar2.f226250c = rVar;
            fsVar2.f226248a |= 2;
        }
        if (optional3.isPresent()) {
            String str = (String) optional3.get();
            frVar.copyOnWrite();
            C82930fs fsVar3 = (C82930fs) frVar.instance;
            str.getClass();
            fsVar3.f226248a |= 4;
            fsVar3.f226251d = str;
        }
        C83334w wVar = this.f214638j;
        C82887ec ecVar = C82887ec.SCREEN_ANNOTATOR;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        C82930fs fsVar4 = (C82930fs) frVar.build();
        fsVar4.getClass();
        eaVar.f225980b = fsVar4;
        eaVar.f225979a = 52;
        wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), (C83320io) optional4.map(C77925e.f214663a).orElse(C83320io.f227132d));
    }
}
