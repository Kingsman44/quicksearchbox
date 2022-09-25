package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
public class FileTeleporter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144209n();

    /* renamed from: a */
    ParcelFileDescriptor f390582a;

    /* renamed from: b */
    final String f390583b;

    /* renamed from: c */
    final String f390584c;

    /* renamed from: d */
    byte[] f390585d;

    /* renamed from: e */
    public File f390586e;

    public FileTeleporter(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.f390582a = parcelFileDescriptor;
        this.f390583b = str;
        this.f390584c = str2;
    }

    public FileTeleporter(byte[] bArr, String str) {
        this((ParcelFileDescriptor) null, "text/plain", str);
        this.f390585d = bArr;
    }

    /* renamed from: a */
    static final void m234420a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f390582a == null) {
            File file = this.f390586e;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.f390582a = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                        try {
                            dataOutputStream.writeInt(this.f390585d.length);
                            dataOutputStream.writeUTF(this.f390583b);
                            dataOutputStream.writeUTF(this.f390584c);
                            dataOutputStream.write(this.f390585d);
                            m234420a(dataOutputStream);
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not write into unlinked file", e);
                        } catch (Throwable th) {
                            m234420a(dataOutputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        throw new IllegalStateException("Temporary file is somehow already deleted.");
                    }
                } catch (IOException e2) {
                    throw new IllegalStateException("Could not create temporary file:", e2);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
            }
        }
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f390582a, i);
        C143947c.m234106y(parcel, 3, this.f390583b);
        C143947c.m234106y(parcel, 4, this.f390584c);
        C143947c.m234083b(parcel, a);
    }
}
