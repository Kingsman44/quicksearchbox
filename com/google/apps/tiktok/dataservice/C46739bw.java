package com.google.apps.tiktok.dataservice;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.database.CursorWrapper;
import java.io.Closeable;

/* renamed from: com.google.apps.tiktok.dataservice.bw */
/* compiled from: PG */
final class C46739bw extends CursorWrapper implements Closeable {

    /* renamed from: a */
    private final ContentProviderClient f122081a;

    /* renamed from: b */
    private int f122082b = -1;

    public C46739bw(Cursor cursor, ContentProviderClient contentProviderClient) {
        super(cursor);
        this.f122081a = contentProviderClient;
    }

    public final void close() {
        try {
            getWrappedCursor().close();
        } finally {
            this.f122081a.close();
        }
    }

    public final int getCount() {
        int count = super.getCount();
        this.f122082b = count;
        return count;
    }

    public final boolean move(int i) {
        int position = getPosition() + i;
        if (super.move(i)) {
            return true;
        }
        if (position < -1 || position > this.f122082b) {
            return false;
        }
        throw new C46742bz();
    }

    public final boolean moveToFirst() {
        if (super.moveToFirst()) {
            return true;
        }
        if (this.f122082b == 0) {
            return false;
        }
        throw new C46742bz();
    }

    public final boolean moveToLast() {
        if (super.moveToLast()) {
            return true;
        }
        if (this.f122082b == 0) {
            return false;
        }
        throw new C46742bz();
    }

    public final boolean moveToNext() {
        if (super.moveToNext()) {
            return true;
        }
        if (isAfterLast()) {
            return false;
        }
        throw new C46742bz();
    }

    public final boolean moveToPosition(int i) {
        if (super.moveToPosition(i)) {
            return true;
        }
        if (i < 0 || i >= this.f122082b) {
            return false;
        }
        throw new C46742bz();
    }

    public final boolean moveToPrevious() {
        if (super.moveToPrevious()) {
            return true;
        }
        if (isBeforeFirst()) {
            return false;
        }
        throw new C46742bz();
    }

    public final boolean requery() {
        boolean requery = super.requery();
        if (requery) {
            this.f122082b = super.getCount();
        }
        return requery;
    }

    public final String toString() {
        return getWrappedCursor().toString();
    }
}
