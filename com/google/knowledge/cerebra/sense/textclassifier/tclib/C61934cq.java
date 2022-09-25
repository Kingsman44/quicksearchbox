package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import com.google.knowledge.cerebra.sense.textclassifier.lib3.LangIdModel;
import java.io.Closeable;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.cq */
/* compiled from: PG */
public final /* synthetic */ class C61934cq implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ TextClassifierLibImpl f167411a;

    public /* synthetic */ C61934cq(TextClassifierLibImpl textClassifierLibImpl) {
        this.f167411a = textClassifierLibImpl;
    }

    public final void close() {
        TextClassifierLibImpl textClassifierLibImpl = this.f167411a;
        textClassifierLibImpl.f167278h.writeLock().lock();
        try {
            LangIdModel langIdModel = textClassifierLibImpl.f167284n;
            if (langIdModel != null) {
                langIdModel.close();
                textClassifierLibImpl.f167284n = null;
                textClassifierLibImpl.f167285o = null;
            }
        } finally {
            textClassifierLibImpl.f167278h.writeLock().unlock();
        }
    }
}
