package com.google.p3723ar.core;

import android.content.Context;
import com.google.p3723ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.ArCoreApk */
/* compiled from: PG */
public class ArCoreApk {

    /* renamed from: com.google.ar.core.ArCoreApk$Availability */
    /* compiled from: PG */
    public enum Availability {
        ;
        
        final int nativeCode;

        private Availability(int i) {
            this.nativeCode = i;
        }

        static Availability forNumber(int i) {
            for (Availability availability : values()) {
                if (availability.nativeCode == i) {
                    return availability;
                }
            }
            throw new FatalException("Unexpected value for native Availability, value=" + i);
        }

        public boolean isSupported() {
            return false;
        }

        public boolean isTransient() {
            return false;
        }

        public boolean isUnknown() {
            return false;
        }

        public boolean isUnsupported() {
            return false;
        }
    }

    /* renamed from: com.google.ar.core.ArCoreApk$ICheckAvailabilityCallback */
    /* compiled from: PG */
    public interface ICheckAvailabilityCallback {
        void onResult(Availability availability);
    }

    protected ArCoreApk() {
    }

    public static ArCoreApk getInstance() {
        return C47901i.f124033a;
    }

    public Availability checkAvailability(Context context) {
        throw new UnsupportedOperationException("Stub");
    }

    public void checkAvailability(Context context, ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        throw new UnsupportedOperationException("Stub");
    }
}
