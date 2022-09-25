package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.google.common.base.C58817ah;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.LangIdModel;
import com.google.knowledge.cerebra.sense.textclassifier.p4674a.p4677c.C61841b;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.cz */
/* compiled from: PG */
public final /* synthetic */ class C61943cz implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ TextClassifierLibImpl f167420a;

    public /* synthetic */ C61943cz(TextClassifierLibImpl textClassifierLibImpl) {
        this.f167420a = textClassifierLibImpl;
    }

    public final Object apply(Object obj) {
        AssetFileDescriptor assetFileDescriptor;
        LangIdModel langIdModel;
        TextClassifierLibImpl textClassifierLibImpl = this.f167420a;
        Void voidR = (Void) obj;
        try {
            C61907bq a = textClassifierLibImpl.f167274d.mo58404g().mo58311a();
            try {
                if (a.mo58343c()) {
                    assetFileDescriptor = (AssetFileDescriptor) a.mo58341a();
                    if (assetFileDescriptor != null) {
                        langIdModel = new LangIdModel(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                    } else {
                        langIdModel = null;
                    }
                    textClassifierLibImpl.f167281k.mo58287d(langIdModel);
                    textClassifierLibImpl.f167278h.writeLock().lock();
                    if (langIdModel != null) {
                        textClassifierLibImpl.f167284n = langIdModel;
                        textClassifierLibImpl.f167285o = new C61841b(langIdModel.nativeGetVersion(langIdModel.f167205a), "*");
                        Log.d("TextClassifierLibImpl", "Loaded langID model: " + textClassifierLibImpl.f167285o.f167103a);
                    } else {
                        textClassifierLibImpl.f167284n = null;
                        textClassifierLibImpl.f167285o = null;
                    }
                    textClassifierLibImpl.f167278h.writeLock().unlock();
                } else {
                    Log.d("TextClassifierLibImpl", "Skipping asynchronous LangId reload. No model change.");
                }
                if (a != null) {
                    a.close();
                }
                return C61947dc.f167425a;
            } catch (IllegalArgumentException e) {
                throw new C61906bp("Could not load LangId model from ".concat(assetFileDescriptor.toString()), e);
            } catch (Throwable th) {
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (C61906bp e2) {
            throw new C61915by("Failed to load the native LangId.", e2);
        } catch (Throwable th2) {
            C61926ci.m94609a(th, th2);
        }
    }
}
