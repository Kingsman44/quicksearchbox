package com.google.p3723ar.core;

import android.net.Uri;

/* renamed from: com.google.ar.core.RecordingConfig */
/* compiled from: PG */
public class RecordingConfig {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    protected RecordingConfig() {
        this.session = null;
        this.nativeHandle = 0;
        this.nativeSymbolTableHandle = 0;
    }

    public RecordingConfig(Session session2) {
        this.session = session2;
        this.nativeHandle = nativeCreateRecordingConfig(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    private native void nativeAddTrack(long j, long j2, long j3);

    private static native long nativeCreateRecordingConfig(long j);

    private static native void nativeDestroyRecordingConfig(long j, long j2);

    private native boolean nativeGetAutoStopOnPause(long j, long j2);

    private native String nativeGetMp4DatasetFilePath(long j, long j2);

    private native String nativeGetMp4DatasetUri(long j, long j2);

    private native int nativeGetRecordingRotation(long j, long j2);

    private native void nativeSetAutoStopOnPause(long j, long j2, boolean z);

    private native void nativeSetMp4DatasetFilePath(long j, long j2, String str);

    private native void nativeSetMp4DatasetUri(long j, long j2, String str);

    private native void nativeSetRecordingRotation(long j, long j2, int i);

    public RecordingConfig addTrack(Track track) {
        nativeAddTrack(this.session.nativeWrapperHandle, this.nativeHandle, track.nativeHandle);
        return this;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyRecordingConfig(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0;
        }
        super.finalize();
    }

    public boolean getAutoStopOnPause() {
        return nativeGetAutoStopOnPause(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @Deprecated
    public String getMp4DatasetFilePath() {
        return nativeGetMp4DatasetFilePath(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Uri getMp4DatasetUri() {
        String nativeGetMp4DatasetUri = nativeGetMp4DatasetUri(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetMp4DatasetUri == null) {
            return null;
        }
        return Uri.parse(nativeGetMp4DatasetUri);
    }

    public int getRecordingRotation() {
        return nativeGetRecordingRotation(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public RecordingConfig setAutoStopOnPause(boolean z) {
        nativeSetAutoStopOnPause(this.session.nativeWrapperHandle, this.nativeHandle, z);
        return this;
    }

    @Deprecated
    public RecordingConfig setMp4DatasetFilePath(String str) {
        nativeSetMp4DatasetFilePath(this.session.nativeWrapperHandle, this.nativeHandle, str);
        return this;
    }

    public RecordingConfig setMp4DatasetUri(Uri uri) {
        nativeSetMp4DatasetUri(this.session.nativeWrapperHandle, this.nativeHandle, uri.toString());
        return this;
    }

    public RecordingConfig setRecordingRotation(int i) {
        nativeSetRecordingRotation(this.session.nativeWrapperHandle, this.nativeHandle, i);
        return this;
    }
}
