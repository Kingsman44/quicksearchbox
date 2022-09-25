package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import com.google.common.base.C58817ah;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.AnnotatorModel;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.LangIdModel;
import java.util.List;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.db */
/* compiled from: PG */
public final /* synthetic */ class C61946db implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ TextClassifierLibImpl f167424a;

    public /* synthetic */ C61946db(TextClassifierLibImpl textClassifierLibImpl) {
        this.f167424a = textClassifierLibImpl;
    }

    /* JADX INFO: finally extract failed */
    public final Object apply(Object obj) {
        AnnotatorModel annotatorModel;
        TextClassifierLibImpl textClassifierLibImpl = this.f167424a;
        List list = (List) obj;
        textClassifierLibImpl.f167277g.writeLock().lock();
        textClassifierLibImpl.f167278h.readLock().lock();
        try {
            LangIdModel langIdModel = textClassifierLibImpl.f167284n;
            if (!(langIdModel == null || (annotatorModel = textClassifierLibImpl.f167280j) == null)) {
                annotatorModel.f167200b = langIdModel;
                annotatorModel.nativeSetLangId(annotatorModel.f167199a, langIdModel.f167205a);
            }
            textClassifierLibImpl.f167278h.readLock().unlock();
            textClassifierLibImpl.f167277g.writeLock().unlock();
            return C61947dc.f167425a;
        } catch (Throwable th) {
            textClassifierLibImpl.f167278h.readLock().unlock();
            textClassifierLibImpl.f167277g.writeLock().unlock();
            throw th;
        }
    }
}
