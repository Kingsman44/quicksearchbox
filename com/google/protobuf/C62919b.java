package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.b */
/* compiled from: PG */
public abstract class C62919b implements C63000ds {
    @Deprecated
    protected static void addAll(Iterable iterable, Collection collection) {
        addAll(iterable, (List) collection);
    }

    private static void addAllCheckingNulls(Iterable iterable, List list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size = list.size();
        for (Object next : iterable) {
            if (next == null) {
                int size2 = list.size();
                String str = "Element at index " + (size2 - size) + " is null.";
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 >= size) {
                        list.remove(size3);
                    } else {
                        throw new NullPointerException(str);
                    }
                }
            } else {
                list.add(next);
            }
        }
    }

    private String getReadingExceptionMessage(String str) {
        String name = getClass().getName();
        return "Reading " + name + " from a " + str + " threw an IOException (should never happen).";
    }

    protected static C63043fh newUninitializedMessageException(MessageLite messageLite) {
        return new C63043fh();
    }

    public abstract C62919b clone();

    /* access modifiers changed from: protected */
    public abstract C62919b internalMergeFrom(C62947c cVar);

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, C62921ba.f169869a);
    }

    public abstract C62919b mergeFrom(C62897ae aeVar, C62921ba baVar);

    public C62919b mergeFrom(C63088z zVar) {
        try {
            C62897ae l = zVar.mo59040l();
            mergeFrom(l);
            l.mo58658A(0);
            return this;
        } catch (C62974ct e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    protected static void addAll(Iterable iterable, List list) {
        C62972cr.m95548h(iterable);
        if (iterable instanceof C62983db) {
            List h = ((C62983db) iterable).mo58968h();
            C62983db dbVar = (C62983db) list;
            int size = list.size();
            for (Object next : h) {
                if (next == null) {
                    int size2 = dbVar.size();
                    String str = "Element at index " + (size2 - size) + " is null.";
                    int size3 = dbVar.size();
                    while (true) {
                        size3--;
                        if (size3 >= size) {
                            dbVar.remove(size3);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (next instanceof C63088z) {
                    dbVar.mo58969i((C63088z) next);
                } else {
                    dbVar.add((String) next);
                }
            }
        } else if (iterable instanceof C63011ec) {
            list.addAll((Collection) iterable);
        } else {
            addAllCheckingNulls(iterable, list);
        }
    }

    public boolean mergeDelimitedFrom(InputStream inputStream, C62921ba baVar) {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        mergeFrom((InputStream) new C62881a(inputStream, C62897ae.m95108J(read, inputStream)), baVar);
        return true;
    }

    public C62919b mergeFrom(C63088z zVar, C62921ba baVar) {
        try {
            C62897ae l = zVar.mo59040l();
            mergeFrom(l, baVar);
            l.mo58658A(0);
            return this;
        } catch (C62974ct e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    public C62919b mergeFrom(C62897ae aeVar) {
        return mergeFrom(aeVar, C62921ba.f169869a);
    }

    public C62919b mergeFrom(MessageLite messageLite) {
        if (getDefaultInstanceForType().getClass().isInstance(messageLite)) {
            return internalMergeFrom((C62947c) messageLite);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public C62919b mergeFrom(InputStream inputStream) {
        C62897ae M = C62897ae.m95110M(inputStream);
        mergeFrom(M);
        M.mo58658A(0);
        return this;
    }

    public C62919b mergeFrom(InputStream inputStream, C62921ba baVar) {
        C62897ae M = C62897ae.m95110M(inputStream);
        mergeFrom(M, baVar);
        M.mo58658A(0);
        return this;
    }

    public C62919b mergeFrom(byte[] bArr) {
        return mergeFrom(bArr, 0, bArr.length);
    }

    public C62919b mergeFrom(byte[] bArr, int i, int i2) {
        try {
            C62897ae O = C62897ae.m95112O(bArr, i, i2);
            mergeFrom(O);
            O.mo58658A(0);
            return this;
        } catch (C62974ct e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    public C62919b mergeFrom(byte[] bArr, int i, int i2, C62921ba baVar) {
        try {
            C62897ae O = C62897ae.m95112O(bArr, i, i2);
            mergeFrom(O, baVar);
            O.mo58658A(0);
            return this;
        } catch (C62974ct e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    public C62919b mergeFrom(byte[] bArr, C62921ba baVar) {
        return mergeFrom(bArr, 0, bArr.length, baVar);
    }
}
