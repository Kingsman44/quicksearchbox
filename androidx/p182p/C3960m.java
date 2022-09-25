package androidx.p182p;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.m */
/* compiled from: PG */
final class C3960m implements Cursor {

    /* renamed from: a */
    private final Cursor f12650a;

    /* renamed from: b */
    private final C3938c f12651b;

    public C3960m(Cursor cursor, C3938c cVar) {
        C69664n.m101061g(cursor, "delegate");
        this.f12650a = cursor;
        this.f12651b = cVar;
    }

    public final void close() {
        this.f12650a.close();
        this.f12651b.mo8224d();
    }

    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        this.f12650a.copyStringToBuffer(i, charArrayBuffer);
    }

    public final void deactivate() {
        this.f12650a.deactivate();
    }

    public final byte[] getBlob(int i) {
        return this.f12650a.getBlob(i);
    }

    public final int getColumnCount() {
        return this.f12650a.getColumnCount();
    }

    public final int getColumnIndex(String str) {
        return this.f12650a.getColumnIndex(str);
    }

    public final int getColumnIndexOrThrow(String str) {
        return this.f12650a.getColumnIndexOrThrow(str);
    }

    public final String getColumnName(int i) {
        return this.f12650a.getColumnName(i);
    }

    public final String[] getColumnNames() {
        return this.f12650a.getColumnNames();
    }

    public final int getCount() {
        return this.f12650a.getCount();
    }

    public final double getDouble(int i) {
        return this.f12650a.getDouble(i);
    }

    public final Bundle getExtras() {
        return this.f12650a.getExtras();
    }

    public final float getFloat(int i) {
        return this.f12650a.getFloat(i);
    }

    public final int getInt(int i) {
        return this.f12650a.getInt(i);
    }

    public final long getLong(int i) {
        return this.f12650a.getLong(i);
    }

    public final Uri getNotificationUri() {
        Cursor cursor = this.f12650a;
        C69664n.m101061g(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        C69664n.m101060f(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public final List getNotificationUris() {
        Cursor cursor = this.f12650a;
        C69664n.m101061g(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        C69664n.m101058d(notificationUris);
        return notificationUris;
    }

    public final int getPosition() {
        return this.f12650a.getPosition();
    }

    public final short getShort(int i) {
        return this.f12650a.getShort(i);
    }

    public final String getString(int i) {
        return this.f12650a.getString(i);
    }

    public final int getType(int i) {
        return this.f12650a.getType(i);
    }

    public final boolean getWantsAllOnMoveCalls() {
        return this.f12650a.getWantsAllOnMoveCalls();
    }

    public final boolean isAfterLast() {
        return this.f12650a.isAfterLast();
    }

    public final boolean isBeforeFirst() {
        return this.f12650a.isBeforeFirst();
    }

    public final boolean isClosed() {
        return this.f12650a.isClosed();
    }

    public final boolean isFirst() {
        return this.f12650a.isFirst();
    }

    public final boolean isLast() {
        return this.f12650a.isLast();
    }

    public final boolean isNull(int i) {
        return this.f12650a.isNull(i);
    }

    public final boolean move(int i) {
        return this.f12650a.move(i);
    }

    public final boolean moveToFirst() {
        return this.f12650a.moveToFirst();
    }

    public final boolean moveToLast() {
        return this.f12650a.moveToLast();
    }

    public final boolean moveToNext() {
        return this.f12650a.moveToNext();
    }

    public final boolean moveToPosition(int i) {
        return this.f12650a.moveToPosition(i);
    }

    public final boolean moveToPrevious() {
        return this.f12650a.moveToPrevious();
    }

    public final void registerContentObserver(ContentObserver contentObserver) {
        this.f12650a.registerContentObserver(contentObserver);
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f12650a.registerDataSetObserver(dataSetObserver);
    }

    public final boolean requery() {
        return this.f12650a.requery();
    }

    public final Bundle respond(Bundle bundle) {
        return this.f12650a.respond(bundle);
    }

    public final void setExtras(Bundle bundle) {
        C69664n.m101061g(bundle, "extras");
        Cursor cursor = this.f12650a;
        C69664n.m101061g(cursor, "cursor");
        C69664n.m101061g(bundle, "extras");
        cursor.setExtras(bundle);
    }

    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.f12650a.setNotificationUri(contentResolver, uri);
    }

    public final void setNotificationUris(ContentResolver contentResolver, List list) {
        C69664n.m101061g(contentResolver, "cr");
        C69664n.m101061g(list, "uris");
        Cursor cursor = this.f12650a;
        C69664n.m101061g(cursor, "cursor");
        C69664n.m101061g(contentResolver, "cr");
        C69664n.m101061g(list, "uris");
        cursor.setNotificationUris(contentResolver, list);
    }

    public final void unregisterContentObserver(ContentObserver contentObserver) {
        this.f12650a.unregisterContentObserver(contentObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f12650a.unregisterDataSetObserver(dataSetObserver);
    }
}
