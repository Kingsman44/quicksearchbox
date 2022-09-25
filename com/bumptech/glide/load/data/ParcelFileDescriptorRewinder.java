package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* compiled from: PG */
public final class ParcelFileDescriptorRewinder implements C5932g {

    /* renamed from: a */
    public final InternalRewinder f17565a;

    /* compiled from: PG */
    public final class InternalRewinder {

        /* renamed from: a */
        private final ParcelFileDescriptor f17566a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f17566a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() {
            try {
                Os.lseek(this.f17566a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f17566a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f17565a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m15281c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12338a() {
        return this.f17565a.rewind();
    }

    /* renamed from: b */
    public final void mo12339b() {
    }
}
