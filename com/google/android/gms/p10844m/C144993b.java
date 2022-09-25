package com.google.android.gms.p10844m;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@Deprecated
/* renamed from: com.google.android.gms.m.b */
/* compiled from: PG */
public final class C144993b implements Parcelable.Creator {

    /* renamed from: a */
    private final Parcelable.Creator f391966a;

    public C144993b(Parcelable.Creator creator) {
        this.f391966a = creator;
    }

    /* renamed from: a */
    public static void m235657a(SafeParcelable safeParcelable, Parcel parcel, C144992a aVar) {
        Parcel obtain = Parcel.obtain();
        try {
            aVar.mo120490a(safeParcelable, obtain);
            byte[] marshall = obtain.marshall();
            File createTempFile = File.createTempFile("teleporter", ".tmp", (File) null);
            RandomAccessFile randomAccessFile = new RandomAccessFile(createTempFile, "rw");
            randomAccessFile.write(marshall);
            randomAccessFile.seek(0);
            createTempFile.delete();
            parcel.writeFileDescriptor(randomAccessFile.getFD());
            randomAccessFile.close();
            obtain.recycle();
        } catch (IOException e) {
            throw new C144994c("Couldn't write SafeParcelable to unlinked file.", e);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ParcelFileDescriptor readFileDescriptor = parcel.readFileDescriptor();
        try {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(readFileDescriptor));
            int available = dataInputStream.available();
            byte[] bArr = new byte[available];
            dataInputStream.read(bArr);
            dataInputStream.close();
            readFileDescriptor.close();
            Parcelable.Creator creator = this.f391966a;
            Parcel obtain = Parcel.obtain();
            try {
                obtain.unmarshall(bArr, 0, available);
                obtain.setDataPosition(0);
                Object createFromParcel = creator.createFromParcel(obtain);
                obtain.recycle();
                return (SafeParcelable) createFromParcel;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } catch (IOException e) {
            throw new C144994c("Couldn't read from unlinked file.", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return (SafeParcelable[]) this.f391966a.newArray(i);
    }
}
