package com.google.knowledge.cerebra.sense.textclassifier.lib3;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public final class DocumentsAnnotatorModel implements Closeable {

    /* renamed from: a */
    private final AtomicBoolean f167202a = new AtomicBoolean(false);

    /* renamed from: b */
    private long f167203b;

    /* compiled from: PG */
    public final class DocumentsAnnotatorRequest {
        public TextBlock[] getTextBlocks() {
            throw null;
        }

        public String getType() {
            throw null;
        }

        public boolean getVerifyCheckSums() {
            throw null;
        }
    }

    /* compiled from: PG */
    public final class DocumentsAnnotatorResponse {
        public float getConfidenceScore() {
            throw null;
        }

        public byte[] getSerializedDocumentData() {
            throw null;
        }

        public String getType() {
            throw null;
        }
    }

    /* compiled from: PG */
    public final class TextBlock {
        public C61859a[] getLines() {
            throw null;
        }
    }

    static {
        C61860b.m94501a();
    }

    public DocumentsAnnotatorModel() {
        long nativeNewDocumentsAnnotator = nativeNewDocumentsAnnotator();
        this.f167203b = nativeNewDocumentsAnnotator;
        if (nativeNewDocumentsAnnotator == 0) {
            throw new IllegalArgumentException("Couldn't initialize Documents annotator.");
        }
    }

    private native void nativeCloseDocumentsAnnotator(long j);

    private static native long nativeNewDocumentsAnnotator();

    private native DocumentsAnnotatorResponse nativeParseDocument(long j, DocumentsAnnotatorRequest documentsAnnotatorRequest, long j2);

    public final void close() {
        if (this.f167202a.compareAndSet(false, true)) {
            nativeCloseDocumentsAnnotator(this.f167203b);
            this.f167203b = 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
