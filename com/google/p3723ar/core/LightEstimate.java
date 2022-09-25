package com.google.p3723ar.core;

import android.media.Image;
import com.google.p3723ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.LightEstimate */
/* compiled from: PG */
public class LightEstimate {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    /* renamed from: com.google.ar.core.LightEstimate$State */
    /* compiled from: PG */
    public enum State {
        NOT_VALID(0),
        VALID(1);
        
        final int nativeCode;

        private State(int i) {
            this.nativeCode = i;
        }

        static State forNumber(int i) {
            for (State state : values()) {
                if (state.nativeCode == i) {
                    return state;
                }
            }
            throw new FatalException("Unexpected value for native LightEstimate.State, value=" + i);
        }
    }

    protected LightEstimate() {
        this.nativeHandle = 0;
        this.session = null;
        this.nativeSymbolTableHandle = 0;
    }

    public LightEstimate(Session session2) {
        this.nativeHandle = 0;
        this.session = session2;
        this.nativeHandle = nativeCreateLightEstimate(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    private native long[] nativeAcquireEnvironmentalHdrCubeMap(long j, long j2);

    private static native long nativeCreateLightEstimate(long j);

    private static native void nativeDestroyLightEstimate(long j, long j2);

    private native void nativeGetColorCorrection(long j, long j2, float[] fArr, int i);

    private native void nativeGetEnvironmentalHdrAmbientSphericalHarmonics(long j, long j2, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightDirection(long j, long j2, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightIntensity(long j, long j2, float[] fArr);

    private native float nativeGetPixelIntensity(long j, long j2);

    private native int nativeGetState(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    public Image[] acquireEnvironmentalHdrCubeMap() {
        long[] nativeAcquireEnvironmentalHdrCubeMap = nativeAcquireEnvironmentalHdrCubeMap(this.session.nativeWrapperHandle, this.nativeHandle);
        ArImage[] arImageArr = new ArImage[nativeAcquireEnvironmentalHdrCubeMap.length];
        for (int i = 0; i < nativeAcquireEnvironmentalHdrCubeMap.length; i++) {
            arImageArr[i] = new ArImage(this.session, nativeAcquireEnvironmentalHdrCubeMap[i]);
        }
        return arImageArr;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyLightEstimate(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public void getColorCorrection(float[] fArr, int i) {
        nativeGetColorCorrection(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i);
    }

    public float[] getEnvironmentalHdrAmbientSphericalHarmonics() {
        float[] fArr = new float[27];
        nativeGetEnvironmentalHdrAmbientSphericalHarmonics(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float[] getEnvironmentalHdrMainLightDirection() {
        float[] fArr = new float[3];
        nativeGetEnvironmentalHdrMainLightDirection(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float[] getEnvironmentalHdrMainLightIntensity() {
        float[] fArr = new float[3];
        nativeGetEnvironmentalHdrMainLightIntensity(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float getPixelIntensity() {
        return nativeGetPixelIntensity(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public State getState() {
        return State.forNumber(nativeGetState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public long getTimestamp() {
        return nativeGetTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
    }
}
