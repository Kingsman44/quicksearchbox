package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import com.google.android.libraries.p579ar.sceneviewer.common.function.HexaConsumer;
import com.google.android.libraries.p579ar.sceneviewer.common.function.HexaFunction;
import com.google.android.libraries.p579ar.sceneviewer.common.function.PentaConsumer;
import com.google.android.libraries.p579ar.sceneviewer.common.function.PentaFunction;
import com.google.android.libraries.p579ar.sceneviewer.common.function.TetraConsumer;
import com.google.android.libraries.p579ar.sceneviewer.common.function.TetraFunction;
import com.google.android.libraries.p579ar.sceneviewer.common.function.TriConsumer;
import com.google.android.libraries.p579ar.sceneviewer.common.function.TriFunction;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p3723ar.imp.view.C47981aa;
import com.google.p3723ar.imp.view.C47986b;
import com.google.p3723ar.imp.view.C47993i;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p3723ar.imp.view.C48011u;
import p3186j$.util.Optional;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpApiHandler */
/* compiled from: PG */
public final class ImpApiHandler {
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.modelviewer.ImpApiHandler");
    C48004n impApi;

    private Optional getNativeHandle() {
        C48004n nVar = this.impApi;
        if (nVar == null) {
            return Optional.empty();
        }
        try {
            long a = nVar.mo53115a();
            if (a == 0) {
                return Optional.empty();
            }
            return Optional.m71637of(Long.valueOf(a));
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) logger.mo56225c()).mo56382g(e)).mo56372aa(42375)).mo56386p("Native handle destroyed, unable to access ImpApi");
            return Optional.empty();
        }
    }

    public void call(HexaConsumer hexaConsumer, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Optional nativeHandle = getNativeHandle();
        if (!nativeHandle.isPresent()) {
            ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42381)).mo56386p("Imp API handle unavailable, unable to execute function call.");
            return;
        }
        hexaConsumer.accept((Long) nativeHandle.get(), obj, obj2, obj3, obj4, obj5);
    }

    public boolean isReady() {
        return getNativeHandle().isPresent();
    }

    public void releaseResources() {
        C48004n nVar = this.impApi;
        if (nVar != null) {
            nVar.mo53116b();
            this.impApi = null;
        }
    }

    public void setImpApi(C48004n nVar) {
        this.impApi = nVar;
    }

    public void startFrameLoop() {
        C48004n nVar = this.impApi;
        if (nVar == null) {
            ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42382)).mo56386p("Imp API handle unavailable, unable to execute function call.");
            return;
        }
        C47981aa aaVar = nVar.f124239b;
        if (aaVar != null) {
            C47993i iVar = aaVar.f124186c;
            iVar.mo53097c(new C47986b(iVar, new C48011u(aaVar)));
        }
    }

    public void stopFrameLoop() {
        C48004n nVar = this.impApi;
        if (nVar == null) {
            ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42383)).mo56386p("Imp API handle unavailable, unable to execute function call.");
            return;
        }
        C47981aa aaVar = nVar.f124239b;
        if (aaVar != null) {
            aaVar.f124186c.mo53098d();
        }
    }

    public Optional call(HexaFunction hexaFunction, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Optional nativeHandle = getNativeHandle();
        if (!nativeHandle.isPresent()) {
            ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42374)).mo56386p("Imp API handle unavailable, unable to execute function call.");
            return Optional.empty();
        }
        return Optional.ofNullable(hexaFunction.apply((Long) nativeHandle.get(), obj, obj2, obj3, obj4, obj5));
    }

    public void call(PentaConsumer pentaConsumer, Object obj, Object obj2, Object obj3, Object obj4) {
        Optional nativeHandle = getNativeHandle();
        if (!nativeHandle.isPresent()) {
            ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42380)).mo56386p("Imp API handle unavailable, unable to execute function call.");
            return;
        }
        pentaConsumer.accept((Long) nativeHandle.get(), obj, obj2, obj3, obj4);
    }

    public Optional call(PentaFunction pentaFunction, Object obj, Object obj2, Object obj3, Object obj4) {
        Optional nativeHandle = getNativeHandle();
        if (!nativeHandle.isPresent()) {
            ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42373)).mo56386p("Imp API handle unavailable, unable to execute function call.");
            return Optional.empty();
        }
        return Optional.ofNullable(pentaFunction.apply((Long) nativeHandle.get(), obj, obj2, obj3, obj4));
    }

    public void call(TetraConsumer tetraConsumer, Object obj, Object obj2, Object obj3) {
        Optional nativeHandle = getNativeHandle();
        if (!nativeHandle.isPresent()) {
            ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42379)).mo56386p("Imp API handle unavailable, unable to execute function call.");
        } else {
            tetraConsumer.accept((Long) nativeHandle.get(), obj, obj2, obj3);
        }
    }

    public Optional call(TetraFunction tetraFunction, Object obj, Object obj2, Object obj3) {
        Optional nativeHandle = getNativeHandle();
        if (nativeHandle.isPresent()) {
            return Optional.ofNullable(tetraFunction.apply((Long) nativeHandle.get(), obj, obj2, obj3));
        }
        ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42372)).mo56386p("Imp API handle unavailable, unable to execute function call.");
        return Optional.empty();
    }

    public void call(TriConsumer triConsumer, Object obj, Object obj2) {
        Optional nativeHandle = getNativeHandle();
        if (!nativeHandle.isPresent()) {
            ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42378)).mo56386p("Imp API handle unavailable, unable to execute function call.");
        } else {
            triConsumer.accept((Long) nativeHandle.get(), obj, obj2);
        }
    }

    public Optional call(TriFunction triFunction, Object obj, Object obj2) {
        Optional nativeHandle = getNativeHandle();
        if (nativeHandle.isPresent()) {
            return Optional.ofNullable(triFunction.apply((Long) nativeHandle.get(), obj, obj2));
        }
        ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42371)).mo56386p("Imp API handle unavailable, unable to execute function call.");
        return Optional.empty();
    }

    public void call(BiConsumer biConsumer, Object obj) {
        Optional nativeHandle = getNativeHandle();
        if (!nativeHandle.isPresent()) {
            ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42377)).mo56386p("Imp API handle unavailable, unable to execute function call.");
        } else {
            biConsumer.accept((Long) nativeHandle.get(), obj);
        }
    }

    public Optional call(BiFunction biFunction, Object obj) {
        Optional nativeHandle = getNativeHandle();
        if (nativeHandle.isPresent()) {
            return Optional.ofNullable(biFunction.apply((Long) nativeHandle.get(), obj));
        }
        ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42370)).mo56386p("Imp API handle unavailable, unable to execute function call.");
        return Optional.empty();
    }

    public void call(Consumer consumer) {
        Optional nativeHandle = getNativeHandle();
        if (!nativeHandle.isPresent()) {
            ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42376)).mo56386p("Imp API handle unavailable, unable to execute function call.");
        } else {
            consumer.accept((Long) nativeHandle.get());
        }
    }

    public Optional call(Function function) {
        Optional nativeHandle = getNativeHandle();
        if (nativeHandle.isPresent()) {
            return Optional.ofNullable(function.apply((Long) nativeHandle.get()));
        }
        ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(42369)).mo56386p("Imp API handle unavailable, unable to execute function call.");
        return Optional.empty();
    }
}
