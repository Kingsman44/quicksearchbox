package com.google.android.youtube.player.p3561b;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.b.bi */
public abstract class C45477bi extends C45506z implements C45478bj {
    public C45477bi() {
        super("com.google.android.youtube.player.internal.IJarEmbedFragmentClient");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo49624i(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                mo49626b((Bundle) C45460as.m81137a(parcel, Bundle.CREATOR));
                break;
            case 3:
                mo49627c();
                break;
            case 4:
                int readInt = parcel.readInt();
                parcel.readString();
                mo49632h(readInt, parcel.readLong());
                break;
            case 5:
                parcel.readLong();
                break;
            case 6:
                mo49630f(parcel.readInt());
                break;
            case 7:
                mo49631g(C45460as.m81141e(parcel));
                break;
            case 8:
                String a = mo49625a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 9:
                mo49628d(parcel.readInt(), parcel.readInt());
                break;
            case 10:
                mo49629e(C45460as.m81141e(parcel));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
